package Com.Tns.Framework;

public  abstract class CurrentAcc {
private final float creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	public void withdraw(float creditLimit)
	{
		
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accNm=" + getAccNm() + ", creditLimit="
				+ creditLimit + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}


