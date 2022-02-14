package Com.Tns.Application;


import Com.Tns.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}
	public void withdtraw(float accBal) {

	}
	@Override
	public String toString() {
		return "MMSavingAcc [accNo=" + accNo + ", accBal=" + accBal + ", toString()=" + super.toString()
				+ ", isSalary()=" + isSalary() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	

}