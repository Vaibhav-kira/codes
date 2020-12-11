package learning;
import java.util.*;
class Mobile{
	int ram,storage;
	
	String D_name;
	Mobile(int i, int j, String s){
		this.D_name= s;
    this.storage=j;
		this.ram= i;

	}
  public int getr(){
		return this.ram;
	}
  public int gets(){
		return this.storage;
	}
  public String getd(){
		return this.D_name;
	}
}

public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  System.out.println("Enter ram\nEnter storage\nEnter Device name\n");
  int i = sc.nextInt();
  int j= sc.nextInt();
  String s1= sc.nextLine();
  String s= sc.nextLine();
  Mobile obj = new Mobile(i,j,s);
  System.out.println("Ram: "+obj.getr());
  System.out.println("Storage: "+obj.gets());
  System.out.println("Device name: "+obj.getd());
  }
}