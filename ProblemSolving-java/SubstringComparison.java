import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] subs = new String[s.length()-k+1];
        for(int i = 0; i<s.length()-k+1;i++){
            subs[i] = s.substring(i, i+k);
        }
        smallest = subs[0];
        largest = subs[0];
        for (int i = 1; i<s.length()-k+1;i++){
            if (subs[i].compareTo(largest)>0) largest = subs[i];
            if (smallest.compareTo(subs[i])>0) smallest = subs[i];
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}