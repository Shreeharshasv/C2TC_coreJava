package Synchronization_day26;

public class BClass {
	int bal1;
	
synchronized void withdraw(int amt)
{
	System.out.println("Getting balance...");
	int oldbal=getBalance1();
	bal1=oldbal-amt;
	setBalance1(bal1);
}

int getBalance1()
{
	return Account.Balance1;
}
void setBalance1(int amt)
{
	try
	{
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		
	}
	Account.Balance1=amt;
}
}