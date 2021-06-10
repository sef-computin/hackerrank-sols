import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static boolean flag;
static Scanner scan = new Scanner(System.in);
static int B;
static int H;

static{
	flag = true;
	B = scan.nextInt();
	H = scan.nextInt();
	if ((B<1)||(H<1)){
		flag = false;
		System.out.println("java.lang.Exception: Breadth and height must be positive");
	}
}


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

