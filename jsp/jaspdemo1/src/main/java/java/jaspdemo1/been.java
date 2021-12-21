package java.jaspdemo1;

public class been {
	private int stuid;
	private String stuname;
	private double marks;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "been [stuid=" + stuid + ", stuname=" + stuname + ", marks=" + marks + "]";
	}
	public been(int stuid, String stuname, double marks) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.marks = marks;
	}

}
