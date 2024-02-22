package loop_assignments;

public class CalculatorDemo {
	
public static void main(String[] args) {
	int sum= calci.add(10, 20);

	double sum2= calci.add(23.45, 34.56, 56.7);
	System.out.println(sum);
	
	System.out.println(sum2);
}
}

class calci{
	static int add(int i,int j) {
		return i+j;
	}
	static float add(float i, float j) {
		return i+j;
	}
	static double add(double i,double j,double k) {
		return i+j+k;
	}
}