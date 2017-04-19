package com.company;

import java.util.Date;

/**
 * Created by dilli on 3/17/2017.
 */
public class WaterHeater extends ServiceCall{
    private int age;
    static double mandatoryFee = 20;

    public WaterHeater(String serviceAddress, String problemDescription, Date date,int age){
        super(serviceAddress,problemDescription,date);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {

        //These statements use the Java ternary operator
        //This says "if resolvedDate == null, then set resolvedDate to "Unresolved". Otherwise, set resolvedDate to resolvedDate.toString()
        //Same logic as an if-else statment, but more consise if the condition is simple and the if statment's task is
        //to set the value of a variable based on a condition being true or false.
        String resolvedDateString = (resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = (this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee + mandatoryFee);

        return "Water Heater Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription + "\n" +
                "Age = "+ age + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                String.format("Mandatory City Fee = $%.2f\n",mandatoryFee)+
                "Fee = " + feeString;
    }
}
