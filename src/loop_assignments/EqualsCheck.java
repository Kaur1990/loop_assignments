package loop_assignments;

public class EqualsCheck {
public static void main(String[] args) {
		String s1= "Java";
		String s2= new String("Java");
		System.out.println(s1==s2);// It compares 1 string literal and 1 string made using new keyword returns false
		System.out.println(s1.equals(s2));// compares the value of 2 strings returns true
}
}
