package models;

import java.util.ArrayList;

public class Manager extends Employee {

    private String dept;
    private int grade;


    public Manager(String firstName, String secondName, String ppsNumber, String dept,int grade) {
        super(firstName,secondName, ppsNumber);
        this.dept=dept;
        this.grade=grade;
    }




    @Override
    public String toString() {
        return super.toString()
                + " Dept:" + dept
                + " Grade:" +
                grade;
    }
}





