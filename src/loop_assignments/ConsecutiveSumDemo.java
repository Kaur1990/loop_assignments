package loop_assignments;
import java.util.*;
public class ConsecutiveSumDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no whose consecutive sum you want to calculate");
	int number=sc.nextInt();
	ConsecutiveNumber.isSumSquareDemo(number);
}
}
class ConsecutiveNumber{
	public static void isSumSquareDemo(int n) {
		for(int x=0; x*x<n; x++) {
			int sum= x*x+(x+1)*(x+1)+ (x+2)*(x+2)+ (x+3)*(x+3);
			if(sum==n) {
				System.out.println("Consecutive no's are:");
				System.out.println(x +","+(x+1)+","+(x+2)+","+(x+3));
			}
		}
		System.out.println("Not find the suitable consecutive no's for the given no.kindly check your no!!");
	}
}