package Day03Examples;

public interface Bankinterface{
	int abc = 40;
	public double withdraw(double amount) throws Exp;
	
	public double diposite(double amount);
	default void newmethod() {
		System.out.println("newly add default method");
		 gen();
	}
	default void mymethod() {
		System.out.println("newly add default method");
		anothernewmethod();
	}
	private void gen() {
		System.out.println("pivate method");
	}
	static void anothernewmethod() {
		System.out.println("newly add static method");
	}

}
