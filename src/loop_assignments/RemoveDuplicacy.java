package loop_assignments;
import java.util.*;
public class RemoveDuplicacy {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any string");
	String s= sc.next();
	String n_str=DuplicacyDemo.sortString(s);
	System.out.println(n_str);
	DuplicacyDemo.DuplicateRemoval(n_str);
}
}
class DuplicacyDemo{
	public static String sortString(String str) {
		char arr[]= str.toCharArray();
		Arrays.sort(arr);
		String s= new String(arr);
		return s;
	}
	public static void DuplicateRemoval(String str) {
		int index1=1;
		int index2=1;
		char arr1[]= new char[30];
		char arr[]=str.toCharArray();
		arr1[0]=arr[0];
		while(index1!=arr.length) {
			if(arr[index1]!=arr[index1-1]) {
				arr1[index2]= arr[index1];
				index2++;
			}
			index1++;
		}
		String duplicateFree=new String(arr1);
		System.out.println(duplicateFree);
	}
}