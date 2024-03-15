package loop_assignments;
import java.util.*;
public class CheckMaxMinArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]= new int[6];
	System.out.println("enter 6 integer values");
	for(int i=0;i<6;i++) {
		int j=sc.nextInt();
		a[i]=j;
	}
	Arrays.sort(a);
	
	int len= a.length;
	//System.out.println(len);
	System.out.println("minimum value="+a[0]);
	System.out.println("maximum value="+a[len-1]);
}
}
