package models;

import java.util.ArrayList;

public class AdminWorker extends Employee{

    private int grade;


    public AdminWorker(String firstName, String secondName, String ppsNumber, int grade) {
        super(firstName,secondName, ppsNumber);
        this.grade = grade;

    }


    @Override
    public String toString() {
        return super.toString()
        + " Grade:" +
                grade;

    }
}
