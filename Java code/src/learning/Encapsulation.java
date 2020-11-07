package learning;

class Studen
{
	private int rollNo;
	private String name;
	
	//right click source generate geters and setters
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
		System.out.println("Roll no. updated");        //maintain a log file
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Studen s1 = new Studen();
		
		//s1.rollNo=5;
		//s1.name="Vaibhav";     Should not be used / possible(if private is used ....)
		
		// geter setter methods
		// right click in class source generate getters and setters ....
		s1.setRollNo(5);
		System.out.println(s1.getRollNo());
		s1.setName("Vaibhav ahuja");
		System.out.println(s1.getName());

	}

}
