package frameworkUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    public Employee(String name) {
        this.name = name;
    }
    public Employee() {

    }

    String name;
    String age;
    String designation;
    Map<String, Double> salary = new HashMap<>();

    public Map<String, Double> getSalary() {
        return salary;
    }

    public void setSalary(Map<String, Double> salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


}
