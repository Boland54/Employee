package models;

import java.util.ArrayList;

/**
 * A scaled down version of a models.Product class
 *
 * @author Siobhan Drohan, Mairead Meagher
 * @version 5.0
 */
public class Employee {

    private String firstName;
    private String secondName;
    private String ppsNumber;



    public Employee(String firstName, String secondName, String ppsNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.ppsNumber = ppsNumber;

    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPpsNumber() {
        return ppsNumber;
    }

    public void setPpsNumber(String ppsNumber) {
        this.ppsNumber = ppsNumber;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "First name: '" + firstName + '\'' +
                ", Second name:'" + secondName + '\'' +
                ", PPS Number: " + ppsNumber;
    }

}
