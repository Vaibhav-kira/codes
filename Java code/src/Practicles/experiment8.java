package Practicles;

//program to read and write object to file :))):)))

import java.io.File;
import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.Serializable;

class A implements Serializable
{
	int sno;
	String uid;
	String name;
	String dob;
	A(int sno,String uid,String name,String dob)
	{
		this.sno=sno;
		this.uid=uid;
		this.name=name;
		this.dob=dob;
	}
}

class output
{
	void print(A o)
	{
		System.out.println("sno : - "+o.sno);
		System.out.println("uid : - "+o.uid);
		System.out.println("name : - "+o.name);
		System.out.println("dob : - "+o.dob);
	}
}

public class experiment8 {

	public static void main(String[] args) {
		
		
		
		
		A obj = new A(1,"19BCS1065","VAIBHAV AHUJA","08-05-2001");
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter name of file");
		String name1=sc1.nextLine();
		sc1.close();
		
		//Serialisation
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\vaibh\\Desktop\\codes\\Java code\\src\\Practicles\\"+name1+".txt");
			ObjectOutputStream out = new ObjectOutputStream (fout); 
			out.writeObject(obj);
			out.close();
			fout.close();
			System.out.println("Object has been serialised");
			System.out.println("Objct in main form");
			output o = new output();
			o.print(obj);
		}
		catch(IOException e)
		{
			System.out.println("Exception ....");
			e.printStackTrace();
		}
		
		
		//deserialisation
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\vaibh\\Desktop\\codes\\Java code\\src\\Practicles\\"+name1+".txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			A obj5 = (A) in.readObject();
			output o = new output();
			System.out.println("Object which is read");
			o.print(obj5);
			in.close();
			fin.close();
		}
		catch(IOException | ClassNotFoundException e)
		{
			System.out.println("Exception ... ");
			e.printStackTrace();
		}
		
		
	}

}
