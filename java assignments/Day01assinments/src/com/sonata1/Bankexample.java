package com.sonata1;
class bank
{
	int accno ;
	String accname ;
	double accbalance;
	public bank() {}
	public  bank(int accno , String accname , double accbalance)
	{
		this.accno = accno;
		this.accname = accname;
		this.accbalance = accbalance;
		
	}
	public void withdraw()
	{
		System.out.println("these is withdraw");
	}
	public void deposite()
	{
		System.out.println(accno);
		System.out.println(accname);
		System.out.println(accbalance);
		
	}
}
public class Bankexample {

	public static void main(String[] args) {
		bank b1 = new bank(10,"ganesh ", 10000.9999);
		bank b2 = new bank();
		b2=b1;
		b1.deposite();
		b2.deposite();
		
		
	}

}
