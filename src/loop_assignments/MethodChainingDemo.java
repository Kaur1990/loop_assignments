package loop_assignments;

public class MethodChainingDemo {
public static void main(String[] args) {
	new ADemoMethod().setInt(11).setFloat(23).Display();
}
}
class ADemoMethod{
	private int a;
	private float b;
	ADemoMethod(){
		System.out.println("Calling the Constructor");
	}
	public ADemoMethod setInt(int a) {
		this.a=a;
		return this;
	}
	public ADemoMethod setFloat(float b) {
		this.b=b;
		return this;
	}
	void Display() {
		System.out.println(a+ " "+b);
	}
}