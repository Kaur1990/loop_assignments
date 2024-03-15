//-----The print statements in comments is just for debugging the code written by me..kindly ignore---------------
package loop_assignments;

import java.util.Arrays;
import java.util.*;
public class CheckAnagram {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 2 strings");
	String s=sc.next();
	String s1=sc.next();
	String ans1=AnagramDemo.arraySort(s);
	//System.out.println(ans1);
	String ans2=AnagramDemo.arraySort(s1);
	//System.out.println(ans2);
	boolean value=AnagramDemo.isAnagram(ans1, ans2);
	System.out.println("The 2 entered strings are Anagram?--"+value);
}
}
class AnagramDemo{
	public static String arraySort(String str) {
		//System.out.println(str);
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		String s=new String(arr);
		//System.out.println(s);
		return s;
	}
	public static boolean isAnagram(String str1, String str2) {
		boolean ans= false;
		//System.out.println(str1);
		//System.out.println(str2);
		char[] arr=str1.toCharArray();
		char[] arr1=str2.toCharArray();
		int i=0;
		while(i<arr.length) {
			if(arr[i]!=arr1[i]) {
				return ans;
			}
			else {
				i++;
			}
		}
		return true;
	}
}