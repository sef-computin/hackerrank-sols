import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        ArrayList<ArrayList> array = new ArrayList<ArrayList>();
        for(int i = 0; i<a;i++){
            array.add(new ArrayList<Integer>());
            int count = scan.nextInt();
            for (int j = 0; j<count; j++) array.get(i).add(new Integer(scan.nextInt()));
        }
        a = scan.nextInt();
        for (int i =0; i<a;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            try{
                System.out.println(array.get(x-1).get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
            
        }
    }
}