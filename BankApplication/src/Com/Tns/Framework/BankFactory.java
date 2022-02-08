package Com.Tns.Framework;

public  abstract class BankFactory {

	public abstract class ShopFactory 
	{

		public abstract SavingAcc getNewPrimeAccount(int AccNo, String accNm, float accBal, boolean isSalary);
		public abstract CurrentAcc getNewNormalAccount(int AccNo, String accNm, float accBal, float creditLimit);
	}
}