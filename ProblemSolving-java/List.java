import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            {list.add(scan.nextInt());}
        n=scan.nextInt();
        for(int i=0;i<n;i++)
        {String Q=scan.next();
         if(Q.compareTo("Insert")==0)
         {list.add(scan.nextInt(),scan.nextInt());
         }
         else
             {list.remove(scan.nextInt());}
        }
        for(int i:list)
            System.out.print(i+ " ");
    }
}