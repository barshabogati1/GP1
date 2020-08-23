package com.vastika.gp.service;

import java.util.List;

import com.vastika.gp.model.*;

public interface AccountInfoService {
	int saveAccountInfo(AccountInfo ai);
	int updateAccountInfo(AccountInfo ai);
	int deleteAccountInfo(AccountInfo ai);
	 AccountInfo getAccountInfoByID(int id);
	 List<AccountInfo> getAll();
	
	

}
