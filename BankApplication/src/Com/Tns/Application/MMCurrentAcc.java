package Com.Tns.Application;


import Com.Tns.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}
	public void withdtraw(float accBal) {

	}
	@Override
	public String toString() {
		return "MMCurrentAcc [accNo=" + accNo + ", accBal=" + accBal + ", toString()=" + super.toString()
				+ ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}