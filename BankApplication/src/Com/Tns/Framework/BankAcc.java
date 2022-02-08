package Com.Tns.Framework;

public  abstract class BankAcc {

		protected int accNo;
		private String accNm;
		protected float accBal;
		
		public BankAcc(int accNo, String accNm, float accBal) 
		{
			super();
			this.accNo = accNo;
			this.setAccNm(accNm);
			this.accBal = accBal;
		}
		public void withdraw(float accBal)
		{
			
		}
		public void items(float accBal)
		{
			
		}
		@Override
		public String toString() {
			return "BankAcc [accNo=" + accNo + ", accNm=" + getAccNm() + ", accBal=" + accBal + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		public String getAccNm() {
			return accNm;
		}
		public void setAccNm(String accNm) {
			this.accNm = accNm;
		
		
	}


}
