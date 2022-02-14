package Com.Tns.Framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalary;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.setSalary(isSalary);

	}

	public void withdtraw(float accBal) {

	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", accNo=" + accNo + ", accBal=" + accBal + ", toString()="
				+ super.toString() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

}