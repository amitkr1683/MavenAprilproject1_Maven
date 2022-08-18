package frameworkUtils;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();



//        Type empType = new TypeToken<Employee>(){}.getType();
        Employee emp = new Employee();
        emp.setName("Mark");
        emp.setAge("25");
        emp.setDesignation("Programmer");
        HashMap<String, Double> salary = new HashMap<>();
        salary.put("2019", 55000D);
        emp.setSalary(salary);

        FileWriter jsonFile = new FileWriter("JSONData/Test.json");
        gson.toJson(emp, jsonFile);
        String jsonInString = gson.toJson(emp);
        System.out.println(jsonInString);



//        Employee emp = gson.fromJson(new FileReader("src/test/employee.json"), Employee.class);
//
//        System.out.println(emp.getAge());
//        System.out.println(emp.getName());
    }


}
