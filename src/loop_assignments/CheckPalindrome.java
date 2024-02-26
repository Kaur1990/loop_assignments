package loop_assignments;
import java.util.*;
public class CheckPalindrome {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter any string");
	String str=sc.next();
	boolean ans=CheckPalin.palinCheck(str);
	System.out.println(ans);
	
}
}
class CheckPalin{
	public static boolean palinCheck(String str) {
		String revstr="";
		boolean ans= false;
		for(int i=(str.length())-1; i>=0; i--){
			//System.out.println((str.length())-1);
			revstr= revstr+ str.charAt(i);
			System.out.println(revstr);
			
		}
		if(str.equals(revstr)) {
			ans = true;
		}
		return ans;
	}
}