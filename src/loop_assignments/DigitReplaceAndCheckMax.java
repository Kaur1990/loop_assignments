package loop_assignments;
import java.util.*;
public class DigitReplaceAndCheckMax {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number and digit to be replaced from that no");
	int number=sc.nextInt();
	int digit=sc.nextInt();
	CheckMaximum.getMaximumNoFromReplace(number, digit);
}
}
class CheckMaximum{
	public static void getMaximumNoFromReplace(int number, int digit) {
		int x= number;
		int y= digit;
		String x_str= Integer.toString(number);
		String y_str= Integer.toString(digit);
		//char ch= (char)y;
		System.out.println(x_str.length());
		System.out.println(y_str.length());
		int maxValue=0;
		
		for(int i=0;i<(x_str.length());i++) {
			//System.out.println(x_str.charAt(i));
			//System.out.println(y_str.charAt(i));
//			int changeVal= Integer.parseInt(x_str.charAt(i));
			if(x_str.charAt(i)== y_str.charAt(0)) {
				//char ch=y_str.charAt(i);
				String n_str= x_str.substring(0, i)+x_str.substring(i+1);
				System.out.println(n_str);
				int changeVal= Integer.parseInt(n_str);
				if(maxValue>changeVal) {
					System.out.println("Maximum Value is"+ maxValue);
				}
				else
				{
					maxValue=changeVal;
				}
			}
		
		}
		}
		}
	
