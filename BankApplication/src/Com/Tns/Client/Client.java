package Com.Tns.Client;

import Com.Tns.Application.MMBankFactory;
import Com.Tns.Application.MMCurrentAcc;
import Com.Tns.Application.MMSavingAcc;

public class Client {
	public static void main(String[] args) {
		MMBankFactory bf= new MMBankFactory();
		MMSavingAcc sa= new MMSavingAcc(1001206, "Shree", 5000, true);
		MMCurrentAcc ca= new MMCurrentAcc(1001524, "Harsha", 2000, 5000);
		
		sa.deposite(2000);
		ca.withdtraw(5200);
		System.out.println(ca.toString());
	}

}
