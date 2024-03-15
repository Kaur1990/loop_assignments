package loop_assignments;
import java.util.*;
public class Merge2StringUpdated {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 strings");
		String str1=sc.next();
		String str2=sc.next();
		Merge1.checkMerge(str1, str2);
	}
}
class Merge1{
	public static void checkMerge(String str1, String str2) {
		StringBuilder s1=new StringBuilder();
		StringBuilder s2=new StringBuilder();
		for(int i=0;i<(str1.length());i++) {
			s1.append(str1.charAt(i));
		}
		for(int i=0;i<(str2.length());i++) {
			s2.append(str2.charAt(i));
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s1.length()|| i<s2.length();i++) {
			if(i<s1.length()) {
				sb.append(s1.charAt(i));
			}
			if(i<s2.length()) {
				sb.append(s2.charAt(i));
			}
		}
		System.out.println(sb);
	}
}