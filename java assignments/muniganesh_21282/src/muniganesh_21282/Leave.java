package muniganesh_21282;

public abstract class Leave { //creating a bean class
	private int EmployeeId ;
	private String name;
	private int LeaveBalance;
	//creating public setters and getters for above private variables
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeaveBalance() {
		return LeaveBalance;
	}
	public void setLeaveBalance(int leaveBalance) {
		LeaveBalance = leaveBalance;
	}
	//Overriding of toString()
	@Override
	public String toString() {
		return "Leave [EmployeeId=" + EmployeeId + ", name=" + name + ", LeaveBalance=" + LeaveBalance + "]";
	}
	//abstract class for ApplyLeave (noOfdaysLeaveApplied)
	abstract int ApplyLeave (int n);
	

}
