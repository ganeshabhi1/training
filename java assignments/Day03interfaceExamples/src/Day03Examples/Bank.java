package Day03Examples;

public class Bank {
	int AccId;
	String Accname;
	double Balance;
	public Bank() {}
	public Bank(int AccId ,String Accname ,double Balance) {
	this.AccId = AccId;
	this.Accname = Accname;
	this.Balance = Balance;
	}
	void display()
	{
		System.out.println(AccId);
		System.out.println(Accname);
		System.out.println(Balance);
	}
	

}
