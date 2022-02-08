package Com.Tns.Application;


	import Com.Tns.Framework.SavingAcc;

	public class MMSavingAcc extends SavingAcc 
	{

		private static final float accBal=0; 
		
		
		public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) 
		{
			super(accNo, accNm, accBal, isSalary);
			// TODO Auto-generated constructor stub
		}
		
		public void withdraw(float accBal)
		{
			
		}

		@Override
		public String toString() {
			return "MMSavingAcc [isSaving=" + isSaving() + ", accNo=" + accNo + ", accBal=" + accBal + ", toString()="
					+ super.toString() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + "]";
		}
		

	}



