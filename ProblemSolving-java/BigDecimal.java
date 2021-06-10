import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
        String[] stemp = s.clone();
        TreeSet<BigDecimal> numbers = new TreeSet<>();
        for (int i =0; i<n;i++) numbers.add(new BigDecimal(s[i]));
        Object[] numbers_arr = numbers.toArray();
        int count = 0;
        Iterator iter = numbers.iterator();
        for(int i = numbers.size()-1; i>-1;i--){
            BigDecimal num = (BigDecimal)numbers_arr[i];
            for(int j = 0;j<n;j++){
                BigDecimal temp = new BigDecimal(stemp[j]);
                if (temp.equals(num)){s[count++]=stemp[j];}
            }
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}