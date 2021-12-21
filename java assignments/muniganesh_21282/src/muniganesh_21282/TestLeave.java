package muniganesh_21282;


public class TestLeave {

	public static void main(String[] args) throws LowBalanceException {
		//object creation for sick leaves
		SickLeave s1 = new SickLeave();
		//object creation for basket leaves
		BasketOfLeaves b1 = new BasketOfLeaves();
		//setting valus for sick leaves
		s1.setEmployeeId(121);
		s1.setName("ganesh");
		s1.setLeaveBalance(10);
		//geting valus for sick leaves
		System.out.println(s1.getEmployeeId());
		System.out.println(s1.getName());
		System.out.println(s1.getLeaveBalance());
		//setting valus for sick leaves
		b1.setEmployeeId(54656);
		b1.setName("abhinaya");
		b1.setLeaveBalance(10);
		b1.ReasonForApplyingLeave ="for some family reasons";
		//geting valus for sick leaves
		System.out.println(b1.getEmployeeId());
		System.out.println(b1.getName());
		System.out.println(b1.getLeaveBalance());
		System.out.println(b1.ReasonForApplyingLeave);
		//exception handling for sick leaves
		if(s1.ApplyLeave(1)<0)
		{
			throw new LowBalanceException("your asking for leave out of your limit ");
		}
		else 
		{
			System.out.println("your leave is granted");
		}
		//exception handling for basket leaves
		if(b1.ApplyLeave(7)<0)
		{
			throw new LowBalanceException("your asking for leave out of your limit ");
		}
		else 
		{
			System.out.println("your leave is granted");
		}
		

	}

}
