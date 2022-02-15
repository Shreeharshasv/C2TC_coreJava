package com.tns.Client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.ShopFactory;

import com.tns.framework.PrimeAcc;
import com.tns.framework.NormalAcc;

public class Client {

	public static void main(String[] args) {
	ShopFactory bf=new GSShopFactory();
	PrimeAcc pa=new GSPrimeAcc(218052, "Shree", 2500, true);
	NormalAcc na=new GSNormalAcc(218053,"Harsha",2500,250);
	
	pa.bookProduct(0);
	na.bookProduct(50);
	System.out.println(na.toString());
	}

}