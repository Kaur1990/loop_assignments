package loop_assignments;

public class Demo {
public static void main(String[] args) {
	A a1=new A();
	a1.method1().method2();
}
}
class A{
	A method1() {
		return this;
	}
	A method2() {
		return this;
	}
}
