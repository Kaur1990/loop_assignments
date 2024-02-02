package loop_assignments;

public class InfiniteLoopTest {
	public static void main(String[] args) {
		//------------------------------------------------------------------
			//1)when the condition is true.
			//	while(true)
//			{
//			System.out.println("Hello");
//			}
			//------------------------------------------------------------------
			//2)when there are no control variables.
//			int i=1;
//			while(i>0)
//			{
//			System.out.println("Hello");
//			}
		//--------------------------------------------------------------
			//3) when run the for loop without any initial, final values and no control variables.
			for(;;) {
				System.out.println("Hello");
			}
		}
}
