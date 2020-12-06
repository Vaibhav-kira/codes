package Practicles;

import java.io.File;              //Import file class
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class experiment7_diffrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of file");
		String name=sc.nextLine();
		sc.close();
		
		try {
			File mydata = new File("C:\\Users\\vaibh\\Desktop\\codes\\Java code\\src\\Practicles\\"+name+".txt");
			if(mydata.createNewFile())
			{
				System.out.println("File is created --->  "+ mydata.getName());
				System.out.println("File is created at path --->  "+ mydata.getAbsolutePath());
			}
			else
			{
				System.out.println("File already exists ");
			}
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		File mydata = new File("C:\\Users\\vaibh\\Desktop\\codes\\Java code\\src\\Practicles\\"+name+".txt");
		if(mydata.exists())
		{
			System.out.println("File exists ");
			System.out.println("File name     : -  "+ mydata.getName());
			System.out.println("File path     : -  "+ mydata.getAbsolutePath());
			System.out.println("Writable      : -  "+ mydata.canWrite());
			System.out.println("Readable      : -  "+ mydata.canRead());
			System.out.println("Size in bytes : -  "+ mydata.length());
		}
		else
		{
			System.out.println("Some error in code");
		}
		
		// Write to a file
		
		try {
			FileWriter mywrite = new FileWriter("C:\\Users\\vaibh\\Desktop\\codes\\Java code\\src\\Practicles\\"+name+".txt");
			mywrite.write("Java experiment 7 :- Write a program to read and write data to file ");
			mywrite.close();
			System.out.println("Successfully wrote to file");
		}
		catch(IOException e)
		{
			System.out.println("An error occured ");
			e.printStackTrace();
		}
		//Read data to a file
		
		try {
			FileReader myread = new FileReader("C:\\Users\\vaibh\\Desktop\\codes\\Java code\\src\\Practicles\\"+name+".txt");
			Scanner read = new Scanner(myread);
			while(read.hasNextLine())
			{
				String data = read.nextLine();
				System.out.println(data);
			}
			read.close();
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
