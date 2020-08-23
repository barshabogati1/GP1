package com.vastika.gp.dao;

import java.util.List;

import com.vastika.gp.model.*;

public interface OpenAccount {
	int  saveAccountInfo(AccountInfo ai);
	int updateAccountInfo(AccountInfo ai); 
	int deleteAccountInfo(AccountInfo ai);
	
	AccountInfo getAccountInfoById(int id);
	List<AccountInfo> getAll();
	
	
	

}
