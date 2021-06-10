import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        String doubleAsString = String.valueOf(payment);
        int indexOfDecimal = doubleAsString.indexOf(".");
        
        String us = "$"+String.format("%,.2f",payment);        
        String india = "Rs."+String.format("%,.2f",payment);
        String china = "￥"+String.format("%,.2f",payment);
        String france = String.format(Locale.FRANCE,"%,.2f",payment)+" €";

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}