package Synchronization_day26;

public class Account {

	static int Balance=10000;
	static int Balance1=10000;
	public static void main(String[] args) {
		AClass oa=new AClass();
		BClass ob=new BClass();
		
		DepositThread dt1=new DepositThread(oa, 5000,"First");
		DepositThread dt2=new DepositThread(oa, 4000,"Second");
		withdrawThread dt3=new withdrawThread(ob, 5000,"First");
		withdrawThread dt4=new withdrawThread(ob, 4000,"Second");
		
		dt1.start();
		dt2.start();
		dt3.start();
		dt4.start();
		try
        {
        dt1.join();
        dt2.join();
        dt3.join();
        dt4.join();
        }
        catch(Exception e)
        {
        }
System.out.println("Total balance after deposit: "+Balance);
System.out.println("Total balance after withdraw: "+Balance1);
	}

}