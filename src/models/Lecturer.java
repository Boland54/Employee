package models;


import java.util.ArrayList;
import java.util.HashSet;

public class Lecturer extends Employee {

    private int level;

    public Lecturer(String firstName, String secondName, String ppsNumber, int level) {
        super(firstName,secondName, ppsNumber);
        this.level = level;

    }




    @Override
    public String toString() {
        return super.toString()
                + " Level:" +
                level;
    }

}
