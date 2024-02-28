package loop_assignments;

public class AllPermutation {
	public static void main(String[] args)
    {
        String s = "123";
      Permute.printPermutn(s, "");
     
    }
	
       
}  
class Permute{
	static void printPermutn(String str, String ans)
    {
 
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                        str.substring(i + 1);
            //int permute= Integer.parseInt(ros);
           // if(permute== 17)
           // {
            //	return ros;
           // }
 
            // Recursive call
            printPermutn(ros, ans + ch);
           
        }
}
}
