$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./features/YahooTest.feature");
formatter.feature({
  "line": 1,
  "name": "Yahoo registration",
  "description": "",
  "id": "yahoo-registration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Yahoo registration with valid credentials",
  "description": "",
  "id": "yahoo-registration;yahoo-registration-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch chrome and opens URL Yahoo registration page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "fill the text boxes: First name, Last name, Email Address, Create password, Birth year",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on Continue",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "fill the correct number with correct contry code",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click on send code",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on i\u0027m not a robot",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on Continue and enter the correct code and varify",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "after Fifteen sec close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Yahoo_Steps.Launch_chrome_and_opens_URL_Yahoo_registration_page()"
});
formatter.result({
  "duration": 12862945600,
  "status": "passed"
});
formatter.match({
  "location": "Yahoo_Steps.fill_the_text_boxes_First_name_Last_name_Email_Address_Create_password_Birth_year()"
});
formatter.result({
  "duration": 1417820200,
  "status": "passed"
});
formatter.match({
  "location": "Yahoo_Steps.click_on_Continue()"
});
formatter.result({
  "duration": 1618140100,
  "status": "passed"
});
formatter.match({
  "location": "Yahoo_Steps.fill_the_correct_number_with_correct_contry_code()"
});
formatter.result({
  "duration": 469123500,
  "status": "passed"
});
formatter.match({
  "location": "Yahoo_Steps.click_on_send_code()"
});
formatter.result({
  "duration": 6468927600,
  "status": "passed"
});
formatter.match({
  "location": "Yahoo_Steps.click_on_i_m_not_a_robot()"
});
formatter.result({
  "duration": 529309800,
  "status": "passed"
});
formatter.match({
  "location": "Yahoo_Steps.click_on_Continue_and_enter_the_correct_code_and_varify()"
});
formatter.result({
  "duration": 153190700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#recaptcha\\-submit\"}\n  (Session info: chrome\u003d103.0.5060.134)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.3\u0027, revision: \u00277b1ebf28ef\u0027\nSystem info: host: \u0027AMITKUMAR\u0027, ip: \u0027169.254.78.21\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [560e9fa56dad90b1d27832129d9b205a, findElement {using\u003did, value\u003drecaptcha-submit}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 103.0.5060.134, chrome: {chromedriverVersion: 103.0.5060.53 (a1711811edd7..., userDataDir: C:\\Users\\amiti\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51263}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:51263/devtoo..., se:cdpVersion: 103.0.5060.134, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 560e9fa56dad90b1d27832129d9b205a\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:567)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:385)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:377)\r\n\tat StepDefinition.Yahoo_Steps.click_on_Continue_and_enter_the_correct_code_and_varify(Yahoo_Steps.java:78)\r\n\tat ✽.When click on Continue and enter the correct code and varify(./features/YahooTest.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Yahoo_Steps.after_Fifteen_sec_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});