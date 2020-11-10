package learning;

public class EvenOdd { 
	public static void main(String[] args) { 
		EvenThread et = new EvenThread(); 
		OddThread ot = new OddThread();  
		et.start(); 
		try{  
			et.join(); 
		}catch(InterruptedException ie){ 
			System.out.println("Probiem in joining the thread"); 
		}
		ot.start();
		try{  
			ot.join(); 
		}catch(InterruptedException ie){ 
			System.out.println("Probiem in joining the thread"); 
		}
	} 
} 
