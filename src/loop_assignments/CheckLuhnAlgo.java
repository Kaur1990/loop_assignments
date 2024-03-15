package loop_assignments;
import java.util.*;
public class CheckLuhnAlgo {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any 16 digit value");
	String s=sc.next();
	char[] arr=s.toCharArray();
	//System.out.println(arr);
	int len=arr.length;
	//System.out.println(len);
	int[] arr1=new int[len];
	for(int i=0;i<len;i++) {
		arr1[i]=Integer.parseInt(String.valueOf(arr[i]));
	}
	int sum=0;
	for(int i=0;i<arr1.length;i++) {
		if(i%2==0) {
			arr1[i]=arr1[i]*2;
			int digit=arr1[i];
			int digitsum=0;
				digitsum=digit%10+digit/10;
			sum+=digitsum;
		}
		else {
			sum+=arr1[i];
		}
	}
	//System.out.println(sum);
	if(sum%10==0) {
		System.out.println("Credit Card no is valid.Kindly make transaction");
	}
	else {
		System.out.println("Oops! Your credit card is invalid.Kindly check with your bank branch.");
	}
}
}
