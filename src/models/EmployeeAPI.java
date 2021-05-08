package models;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import models.Employee;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeAPI {
    private ArrayList<Employee> emp;


    public EmployeeAPI(){
        for (Employee employee : emp = new ArrayList<Employee>());

    }



    public void addEmployee(Employee employee){
        emp.add(employee);

    }

    public Employee getEmployee(int index )
    {
        if (emp.size() > 0) {
            return (Employee) emp.get(index);
        }
        else{
            return null;
        }
    }


    public int numberOfEmployees(){
        return emp.size();
    }

    public String listEmployees()
    {
        String str = "";
        int index = 0;
        if(emp.size()>0) {
             //to display the index number for deleting

            for (Employee employee : emp) {
                str += index + ": " + employee.toString() + "\n\n";
                index++;
            }
            return str;
        }else return "No Employees";
    }


    public boolean removeEmployee(int index){
        if(index<0 || index>= emp.size()) {
            return false;
        }
        else{
            emp.remove(index);
            return true;
        }
    }
    public void load() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        ObjectInputStream is = xstream.createObjectInputStream(new FileReader("employee.xml"));
        emp = (ArrayList<Employee>) is.readObject();
        is.close();
    }

    public void save() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("employee.xml"));
        out.writeObject(emp);
        out.close();
    }

}