package loop_assignments;

public class CheckStaticNonStaticDemo {
	
   public static void main(String[] args) {
	CalciDemo cd= new CalciDemo();
	cd.name="Bismeet";
	cd.m1();
	CalciDemo.name1="Raman";
	CalciDemo.m2();
	int sum=cd.add(34, 68);
	System.out.println(sum);
	int sum1=CalciDemo.add(23, 334, 45);
	System.out.println(sum1);
	int sq=cd.squareDemo();
	System.out.println(sq);
	int sq1=CalciDemo.squareDemo1();
	System.out.println(sq1);
}
}
class CalciDemo{
	//--------------------Demonastrate the static/non-static void method
	String name;
  static String name1;
	void m1()
	{
		System.out.println(name + "Hello");
	}
	static void m2() {
		System.out.println(name1 +"hello world");
	}
	//-----------------Demo of static/non-static parameterized method
	int add(int i, int j) {
		return i+j;
	}
	static int add(int i, int j,int k) {
		return i+j+k;
	}
	//--------------------------Demo of method with int return type without any argument
	int squareDemo() {
		int i=10;
		return i*i;
	}
	static int squareDemo1()
	{
		int i=23;
		return i*i;
	}
}