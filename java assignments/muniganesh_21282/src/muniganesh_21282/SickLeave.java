package muniganesh_21282;

public class SickLeave extends Leave {
	//body of abstract class provided here for sickleave
	public int ApplyLeave (int n)
	{
		int res = (super.getLeaveBalance()*2/10) - n;
		return res;
	}

}
