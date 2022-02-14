package Com.Tns.Framework;

public abstract class CurrentAcc extends BankAcc {
	
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public void withdtraw(float accBal) {

	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accBal=" + accBal + ", toString()="
				+ super.toString() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}