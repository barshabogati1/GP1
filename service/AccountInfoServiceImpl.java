package com.vastika.gp.service;

import java.util.List;

import com.vastika.gp.dao.OpenAccount;
import com.vastika.gp.dao.OpenAccountImpl;
import com.vastika.gp.model.AccountInfo;

public class AccountInfoServiceImpl implements AccountInfoService {
	OpenAccount infoDao= new OpenAccountImpl();

	@Override
	public int saveAccountInfo(AccountInfo ai) {
		// TODO Auto-generated method stub
		return infoDao.saveAccountInfo(ai);
	}

	@Override
	public int updateAccountInfo(AccountInfo ai) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAccountInfo(AccountInfo ai) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AccountInfo getAccountInfoByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountInfo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
