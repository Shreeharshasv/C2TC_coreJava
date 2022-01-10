package oops;

public class StaticVariable

	{
		//class variables
		final static int a =1024;
		int b;
		void func1()
		{
			final int c;
			c=10;
			System.out.println("class variables" +a+ ""+b);
			System.out.println("local variables" +c);
			//a =7890;
			  b =56;
			  System.out.println("class variables" +a+ ""+b);
		}
		void func2() 
		{
			System.out.println("class variables" +a+ ""+b);
		}
		public static void main(String []args)
		{
			StaticVariable obj = new StaticVariable();
			System.out.println(obj.b);
			System.out.println(StaticVariable.a);

	}

}
