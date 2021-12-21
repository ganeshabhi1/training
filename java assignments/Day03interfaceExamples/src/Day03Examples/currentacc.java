package Day03Examples;

import com.sonata.exceptionhandling.myownExp;

public class currentacc extends com.beanexample.Bank implements Bankinterface {
	public double withdraw(double amount) {
		double x = super.getBalance() - amount;
		return x;
		
	}
	public double diposite(double amount) {
		double y = super.getBalance() + amount;
		return y;
	}
	public static void main(String[] args) throws Exp {
		currentacc c1 = new currentacc();
		c1.setAccId(123); 
		c1.setAccname("ganesh");
		c1.setBalance(123);
		if(c1.withdraw(121)==0)
		{
			throw new Exp("your unable to withdraw ");
		}
		else
		{
			System.out.println("withdraw is completed and your balance is"+c1.withdraw(121));
		}
		System.out.println(c1.diposite(2000));
		System.out.println(c1);
	}

}

	