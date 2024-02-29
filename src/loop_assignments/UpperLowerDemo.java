package loop_assignments;
import java.util.*;
public class UpperLowerDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s= sc.next();
		DemoConversion.convertDemo(s);
	}
}
class DemoConversion{
	public static void convertDemo(String str) {
		System.out.println(str);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			Character ch= str.charAt(i);
			if(Character.isLowerCase(ch)) {
				sb.append(Character.toUpperCase(ch));
			}
			if(Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			}
			if(!Character.isLowerCase(ch) & !Character.isUpperCase(ch)) {
				sb.append(ch);
			}
		}
		System.out.println(sb);
		
	}
}
