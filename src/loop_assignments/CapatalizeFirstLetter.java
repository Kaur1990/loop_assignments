package loop_assignments;
import java.util.*;
public class CapatalizeFirstLetter {
public static void main(String[] args) {
	 
	
	String instr= "the quick brown fox jumps over the lazy dog.";
	String str1=AStringDemo.capatalizedString(instr);
	System.out.println(str1);
	
	
	
	
	
}
}
class AStringDemo{
	public static String capatalizedString(String instr) {
		//System.out.println(instr);
		String capital="";
		String[] parts=instr.split(" ");
		for(int i=0;i<parts.length;i++) {
			//System.out.println(parts[i]);
			String[] allLetters= parts[i].split("");
			
			capital=capital+allLetters[0].toUpperCase();
			//System.out.println(capital);
			for(int j=1;j< allLetters.length;j++) {
				
				capital= capital+allLetters[j];
				//System.out.println(capital);
			}
			capital=capital+" ";
		}
		return capital;
	}
}
