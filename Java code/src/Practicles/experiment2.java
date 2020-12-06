package Practicles;

class A2
{
	private int a;
	private String name;
	private String dob;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}

public class experiment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 obj = new A2();
		obj.setA(5);
		obj.setName("Vaibhav");
		obj.setDob("08-05-2001");
		System.out.println(obj.getA()+"  ");
		System.out.println(obj.getName()+"  ");
		System.out.println(obj.getDob()+"  ");

	}

}
