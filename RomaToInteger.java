import java.util.HashMap;
import java.util.Scanner;
public class RomaToInteger {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number  roman number:");      
       String roman=sc.next();
       int n=roman.length();
       HashMap<Character,Integer> hm=new HashMap<>();
       hm.put('I', 1);
       hm.put('V', 5);
       hm.put('X', 10);
       hm.put('L', 50);
       hm.put('C', 100);
       hm.put('D', 500);
       hm.put('M', 1000);
       hm.put('i', 1);
       hm.put('v', 5);
       hm.put('x', 10);
       hm.put('l', 50);
       hm.put('c', 100);
       hm.put('d', 500);
       hm.put('m', 1000);
       
       int sum=hm.get(roman.charAt(n-1));
       for(int i=n-2;i>=0;i--)
       {
    	   if(hm.get(roman.charAt(i))<hm.get(roman.charAt(i+1)))
    	   {
    		   sum=sum-hm.get(roman.charAt(i));
    	   }
    	   else
    	   {
    		   sum=sum+hm.get(roman.charAt(i));
    	   }
       }
       System.out.println(sum);
	}
       }