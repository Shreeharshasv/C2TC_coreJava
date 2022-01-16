package Day15_ExceptionHandling;

public class ExceptionHandling {
	public static void main(String[] args) {
		try
		{
		int data =50/0;
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		System.out.println("Exception Handling");
				
	}

}
