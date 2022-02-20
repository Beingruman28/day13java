package day13java;

public class ArithmeticExceptionHandling1 {

	public static void main (String[] args) {
		int a=10;
		for(int i=3;i>=0;i--)
		{
			
		     try {
				System.out.println(a/i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		   }	
}
}
