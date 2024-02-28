package loop_assignments;

public class InterningDemo {
public static void main(String[] args) {
	String str1= new String("Java");
	String str2= new String("Java");
	System.out.println(str1==str2);
	System.out.println(str1.equals(str2));
	String str3=str1.intern(); //interning of string
	String str4= str2.intern();
	System.out.println(str3==str4);
}
}
