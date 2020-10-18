package learning;

public class variable {
	public static void main(String args[])
	{
		int i = 5; // 4 bytes -> 32 bits  big range
		
		short k = 5; // 2 bytes (less space) -> 16 bits -> -32768 to +32767
		
		byte j = 5; //1 byte (very less space) -> 8 bits -> -128 to 127
		
		//if digit more than 10 digits use long
		
		long m = 5000000000l; // must specify l as it has 8 bytes else it will give error for no. which are not supported in int
		
	    float f = 5.5f; // need to specify f else error as 5.5 is double by default
	    
	    char c = 'A';
	    
	    c = 66;//can asign int to char
	    
	    System.out.println(c);// prints B as 66 is ASCII value i.e. American Standard code for information iterchange 
	    
	    double d1 = 5;//implicite convertion 
	    
	    int i2 = (int)5.5;//error without int // type casting explicite
	    
	    System.out.println(i2);//only 5 will be printedm
	    
	    
	    
	    
	}
}
