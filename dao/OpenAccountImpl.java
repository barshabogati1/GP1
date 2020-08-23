package com.vastika.gp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.vastika.gp.model.AccountInfo;
import com.vastika.gp.util.DButil;

public class OpenAccountImpl implements OpenAccount {
	public static final String Insert_SQl= " insert into account_info_tbl(account_name, address, mobile_no,unique_id_type)values(?,?,?,?)";

	@Override
	public int saveAccountInfo(AccountInfo ai) {
		int saved =0;
		try(
				Connection con =DButil.getConnection();
				PreparedStatement ps = con.prepareStatement(Insert_SQl);
				)
		{
			ps.setString(1, ai.getAccountName());
			ps.setString (2, ai.getAddress());
			ps.setLong(3,ai.getMobileNumber());
			ps.setString(4, ai.getUniqueIdType());
			saved = ps.executeUpdate();
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		return saved;
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
	public AccountInfo getAccountInfoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountInfo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
