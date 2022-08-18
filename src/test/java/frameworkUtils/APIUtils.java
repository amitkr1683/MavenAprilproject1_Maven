package frameworkUtils;

//import cucumber.api.java.sl.In;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import static com.google.common.io.ByteStreams.copy;

public class APIUtils {


    //1 intializeXMLDOC
    //2. Updating Node Value for Country ISO Code
    //3. Update Request xml
    //4. postAPI
    //5. read result

    Document reqDOC, resDOC;
    String apiURL = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso";
    String reqXMLPath = "APIXMLs/Request.xml";
    String resXMLPath ="APIXMLs/Response.xml";

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
        APIUtils apUtil = new APIUtils();
        apUtil.initializeXMLDOC();
        apUtil.updateCountryCd("IN");
        apUtil.writeUpdatedRqXML();
        apUtil.postAPI();
        apUtil.readResult();


    }

    private void postAPI() throws IOException, TransformerException {
        //Create HTTP connection

        URL url = new URL(apiURL);
        URLConnection conn = url.openConnection();
        HttpURLConnection httpConn = (HttpURLConnection) conn;
        FileInputStream fis = new FileInputStream(reqXMLPath);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        copy(fis, bout);
        fis.close();
        byte[] byteArr = bout.toByteArray();


        //Set the HTTP parameters
        httpConn.setRequestProperty("Content-Length", String.valueOf(byteArr.length));
        httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
        httpConn.setRequestProperty("SOAPAction", apiURL);
        httpConn.setRequestMethod("POST");
        httpConn.setDoOutput(true);
        OutputStream out = httpConn.getOutputStream();
        out.write(byteArr);
        out.close();


        //Make API call and read the response
        httpConn.connect();
        System.out.println("Connection Status: " +httpConn.getResponseMessage());
        InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
        BufferedReader in = new BufferedReader(isr);

        String responseAll = null;
        String inputLine = null;

        while ((inputLine = in.readLine())!=null){
            responseAll = responseAll + inputLine;
        }
        responseAll = responseAll.replaceAll("null", "");
        resDOC = convertStringToDoc(responseAll);

        //Write to response.xml
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(resDOC);
        StreamResult result = new StreamResult(new File(resXMLPath));
        transformer.transform(source, result);
        in.close();

    }

    private Document convertStringToDoc(String responseAll) {
        Document doc = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;


        try {
            builder = factory.newDocumentBuilder();
            doc = builder.parse(new InputSource(new StringReader(responseAll.trim())));

        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return doc;

    }


    private void readResult() {
        String result = resDOC.getElementsByTagName("m:CapitalCityResult").item(0).getTextContent();
        System.out.println(result);

    }



    private void writeUpdatedRqXML() {
        TransformerFactory transFactory = TransformerFactory.newInstance();
        try {
            Transformer transformer = transFactory.newTransformer();
            DOMSource source = new DOMSource((reqDOC));
            StreamResult result = new StreamResult(new File(reqXMLPath));
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }


    }

    private void updateCountryCd(String code) {

        reqDOC.getElementsByTagName("web:sCountryISOCode").item(0).setTextContent(code);

    }

    private void initializeXMLDOC() {
        DocumentBuilderFactory docFactor = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder docBuilder = docFactor.newDocumentBuilder();
            reqDOC = docBuilder.parse(new File((reqXMLPath)));
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
