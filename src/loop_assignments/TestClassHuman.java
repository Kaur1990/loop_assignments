package loop_assignments;

public class TestClassHuman {
	public static void main(String[] args) {
		Human h1= new Human();
		h1.name="Raman";
		h1.speak("hello");
	}
}
class Human{
	String name;
	int age;
	public void speak(String content)
	{
		System.out.println(name + "- "+ content);
	}
}