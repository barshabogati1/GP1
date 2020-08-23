package com.vastika.gp.model;

public class AccountInfo {

	private int id;
	private String accountName;
	private String address;
	private Long mobileNumber;
	private String uniqueIdType;
	
	public int getId() {
		return this.id;	
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getAccountName(){
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName= accountName;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public long getMobileNumber() {
		return this.mobileNumber;	
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber=mobileNumber;
	}
	public String getUniqueIdType() {
		return this.uniqueIdType;
	}
	public void setUniqueIdType(String uniqueIdType) {
		this.uniqueIdType = uniqueIdType;
	}
}
