package loop_assignments;
import java.util.*;
public class SumOfDigitInString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any string");
	String s=sc.next();
	SumString.sumOfValues(s);
}
}
class SumString{
	public static void sumOfValues(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char temp=s.charAt(i);
			if(Character.isDigit(temp)) {
				sum+=Integer.parseInt(String.valueOf(temp));
			}
			
		}
		System.out.println("sum of digits in string="+sum);
		
	}
}
