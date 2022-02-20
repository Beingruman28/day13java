package day13java;

public class ArithmeticExceptionHandling {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				System.out.println(5/0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println("End of program!");
		}
	}
