package Practicles;

import java.io.*;
public class File_reader {
	public static void main(String[] args) throws Exception{
		FileReader fin = new FileReader("C:\\Users\\Administrator\\Desktop\\Practice\\test1.txt");
		FileWriter fout = new FileWriter("C:\\Users\\Administrator\\Desktop\\Practice\\test1.txt");

    int b;
    while((b= fin.read())!=-1) {
			System.out.print((char)b);
		}
		fin.close();
	
	String sc="And he is sexy and you know it...):";
	fout.write(sc);
	fout.close();
	}
}