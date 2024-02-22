package loop_assignments;

public class ATest {
public static void main(String[] args) {
	ADemo ad= new ADemo();
	ad.commentMethod("Hello", "World");
}
}

class ADemo{
	/**
	 * This method is learn documentation comment in java.
	 * <br/> This line i am writing for HTML presentation.
	 * @param str1
	 * @param str2
	 */
	public void commentMethod(String str1, String str2) {
		System.out.println(str1 + str2);
	}
}