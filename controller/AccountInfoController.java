package com.vastika.gp.controller;


import java.util.Scanner;

import com.vastika.gp.model.AccountInfo;
import com.vastika.gp.service.AccountInfoService;
import com.vastika.gp.service.AccountInfoServiceImpl;


public class AccountInfoController {

	AccountInfoService accountinfoservice = new AccountInfoServiceImpl();

	public void saveUserInfo(Scanner input) {
		AccountInfo ai = new AccountInfo();
		System.out.println("Enter account_name: ");
		String accountName = input.nextLine();
		System.out.println("Enter address: ");
		String address = input.nextLine();
		System.out.println("Enter mobile_no: ");
		long mobileNo= input.nextLong();
		System.out.println("Enter unique id type passport number/ citizenship : ");
		String uniqueIdType = input.nextLine();

		ai.setAccountName(accountName);
		ai.setAddress(address);
		ai.setMobileNumber(mobileNo);
		ai.setUniqueIdType(uniqueIdType);
		
		
		int saved = accountinfoservice.saveAccountInfo(ai);
		if (saved >= 1) {
			System.out.println("User info is saved in db successfully!!!");
		} else {
			System.out.println("error in db.");
		}
	}
}
