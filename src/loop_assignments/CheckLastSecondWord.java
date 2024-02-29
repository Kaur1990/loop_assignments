package loop_assignments;
import java.util.*;
public class CheckLastSecondWord {
public static void main(String[] args) {
	
	String str= "The quick brown fox jumps over the lazy dog.";
	CheckPenultimate.lastSecondWordChecker(str);
}
}
class CheckPenultimate{
	public static void lastSecondWordChecker(String str) {
		System.out.println(str);
		String[] parts=str.split(" ");
		int len=parts.length;
//		for(int i=0;i<parts.length;i++) {
//			System.out.println(parts[i]);
//		}
		System.out.println("Penultimate word:"+parts[len-2]);
		
	}
}