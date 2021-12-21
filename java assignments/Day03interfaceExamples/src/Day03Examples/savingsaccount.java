package Day03Examples;

import com.sonata.exceptionhandling.myownExp;

public class savingsaccount extends Bank implements Bankinterface{
	public double withdraw(double amount) {
		double x = super.Balance - amount;
		return x;
		
	}
	public double diposite(double amount) {
		double y = super.Balance + amount;
		return y;
		
	}

	public static void main(String[] args)  {
		savingsaccount s1 = new savingsaccount();
		s1.AccId = 123;
		s1.Accname = "ganesh";
		s1.Balance = 123.5000;
		s1.display();
		System.out.println(s1.diposite(100000));
		savingsaccount s2 = new savingsaccount();
		s2.AccId = 123;
		s2.Accname = "ganesh";
		s2.Balance = 123.5000;
		s2.display();
		System.out.println(s1.withdraw(100000));
		s1.newmethod();
		s1.mymethod();
		
		

	}

}
