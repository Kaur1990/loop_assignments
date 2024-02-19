package loop_assignments;

public class A {
	public static void main(String[] args) {
		B b1=new B();
		System.out.println(b1.add(b1.add(10, 20), b1.add(30, 40)));
	}

}
class B{
	public int add(int i,int j) {
		return i+j;
	}
}
