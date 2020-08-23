package com.vastika.gp.model;

public class AccountBalance {
	private int id;
	private double depositAmount;
	private double withdrawAmount;
	private double balanceAccount;
	private int infoId;	
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getDepositAmount() {
		return this.depositAmount;
	}
	public void setDepositAmount(double depositAmount){
		this.depositAmount=depositAmount;
	}
	public double getWithdrawAmount() {
		return this.withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount){
		this.withdrawAmount=withdrawAmount;
	}
	public  double getBalanceAcoount() {
		return this.balanceAccount;
	}
	public void setBalanceAccount(double balanceAccount) {
		this.balanceAccount = balanceAccount;
	}
	public int getInfoId() {
		return this.infoId;
	}
	public void setInfoId(int infoId) {
		this.infoId=infoId;
	}

	
}
	
