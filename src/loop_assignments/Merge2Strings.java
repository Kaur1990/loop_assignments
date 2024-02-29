//we use stringbuffer/stringbuilder class instead 
//of string because of mutable nature and 
//more inbuilt functions to use in code easily.
package loop_assignments;
import java.util.*;
public class Merge2Strings {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 strings");
	String str1=sc.next();
	String str2=sc.next();
	Merge.checkMerge(str1, str2);
}
}
class Merge{
	public static void checkMerge(String str1, String str2) {
		System.out.println(str1);
		System.out.println(str2);
//		String s1="";
//		String s2="";
		StringBuilder s1=new StringBuilder();
		StringBuilder s2=new StringBuilder();
//		String[] parts=str1.split("");
//		String[] parts1=str2.split("");
//		System.out.println(parts);
//		System.out.println(parts1);
		for(int i=(str1.length())-1;i>=0;i--) {
			s1.append(str1.charAt(i));
		}
		System.out.println(s1);
		for(int i=(str2.length())-1;i>=0;i--) {
			s2.append(str2.charAt(i));
		}
		System.out.println(s2);
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