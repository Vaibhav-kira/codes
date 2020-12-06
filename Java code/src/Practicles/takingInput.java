package Practicles;
import java.util.*;
public class takingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the your uid ");
		String uid=sc.nextLine();
		System.out.println("Enter first number ");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println(uid);
		System.out.println("Sum is "+(a+b));
		sc.close();
	}

}