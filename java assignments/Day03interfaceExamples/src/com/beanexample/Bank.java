package com.beanexample;

public class Bank implements java.io.Serializable{
	private int accId;
	private String accname ;
	private double Balance;
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [accId=" + accId + ", accname=" + accname + ", Balance=" + Balance + "]";
	}

}
