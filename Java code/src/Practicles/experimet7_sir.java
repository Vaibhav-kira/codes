package Practicles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class experimet7_sir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter name of file ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		sc.close();
		
		//creating file
		
		try {
			File mydata = new File("C:\\Users\\vaibh\\Desktop\\codes\\Java code\\src\\Practicles\\"+name+".txt");
			if(mydata.createNewFile())
			{
				
			}
			else
			{
				System.out.println("File exists");
			}
			
		}
		catch(IOException e)
		{
			System.out.println("error occured");
			e.printStackTrace();
		}
		
		//writing file
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\vaibh\\Desktop\\codes\\Java code\\src\\Practicles\\"+name+".txt");
			String s = "Delhi Haryana Punjab '";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		//reading file
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\vaibh\\Desktop\\codes\\Java code\\src\\Practicles\\"+name+".txt");
			int size = fin.available();
			System.out.println("Total number of bytes : - "+ size);
			int b;
			while((b=fin.read())!=-1)
			{
				System.out.print((char)b);
			}
			fin.close();
			/*for(int i=0;i<size;i++)
			{
				System.out.print((char)fin.read());
			}*/
		} catch (IOException f) {
			// TODO Auto-generated catch block
			f.printStackTrace();
		}
		
	}

}
