import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DeterminingDNAHealth {

    private static final Scanner scanner = new Scanner(System.in);
    
    
    public static int countHealth(String[] genes, int[] vals, String seq, int start, int fin){
        int totalHealth = 0;

        for(int i = start; i<=fin;i++){
            String temp = seq;
            while(temp.contains(genes[i])) {totalHealth+=vals[i]; temp = temp.substring(temp.indexOf(genes[i])+1);};
        }
        return totalHealth;
    };
    

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] genes = new String[n];

        String[] genesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String genesItem = genesItems[i];
            genes[i] = genesItem;
        }

        int[] health = new int[n];

        String[] healthItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int healthItem = Integer.parseInt(healthItems[i]);
            health[i] = healthItem;
        }

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int minHealth = -1;
        int maxHealth = -1;
        for (int sItr = 0; sItr < s; sItr++) {
            String[] firstLastd = scanner.nextLine().split(" ");

            int first = Integer.parseInt(firstLastd[0]);

            int last = Integer.parseInt(firstLastd[1]);

            String d = firstLastd[2];
            int count = countHealth(genes, health, d, first, last);
            if (minHealth == -1){minHealth = count;maxHealth = count;}
            else { if (count > maxHealth) maxHealth = count;
                if (count<minHealth) minHealth = count;
                }
        }
        System.out.println(minHealth+" "+maxHealth);
        
        scanner.close();
    }
}
