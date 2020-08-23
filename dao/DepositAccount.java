package com.vastika.gp.dao;

import java.util.List;

import com.vastika.gp.model.AccountInfo;

public interface DepositAccount {
	int  saveAccountInfo(AccountBalance ab);
	int updateAccountInfo(AccountInfo a); 
	int deleteAccountInfo(AccountInfo ai);
	
	AccountInfo getAccountInfoById(int id);
	List<AccountInfo> getAll();
}
