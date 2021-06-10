import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        BigInteger a;
        BigInteger b;
        
        Scanner scan = new Scanner(System.in);
        
        a = new BigInteger(scan.nextLine());
        b = new BigInteger(scan.nextLine());
        
        System.out.println(a.add(b).toString());
        System.out.println(a.multiply(b).toString());
    
    }
}