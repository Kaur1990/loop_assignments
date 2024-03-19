package loop_assignments;
import java.util.*;
public class ReverseStringCheck {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any string");
	String str=sc.next();
	String revStr="";
	for(int i=str.length()-1;i>=0;i--) {
		revStr=revStr+str.charAt(i);
	}
	System.out.println("Reverse String="+revStr);
}
}
