package muniganesh_21282;

public class BasketOfLeaves extends Leave {
	String ReasonForApplyingLeave;
	//body of abstract class provided here for basketleave
	public int ApplyLeave (int n)
	{
		int res = (super.getLeaveBalance()*8/10) - n;
		return res;
	}

}
