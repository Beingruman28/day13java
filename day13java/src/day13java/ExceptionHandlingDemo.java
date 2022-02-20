package day13java;

public class ExceptionHandlingDemo {
	
		static void canVote(int age){
			if(age<18)
				try {
					System.out.println("you are not an adult!");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else
	           
			   System.out.println("you can vote!");
		}
		public static void main (String[] args) {
			canVote(20);
			canVote(10);
		}
	}
