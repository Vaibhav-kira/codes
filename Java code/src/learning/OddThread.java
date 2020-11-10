package learning;

public class OddThread extends Thread{ 
	public void run(){ 
		try{ 
			for (int i = 1; i <= 20; i++) { 
				if(i%2==1){ 
					System.out.println("Odd Thread:\t"+i); 
					Thread.sleep(100); 
				} 
			} 
		}catch(InterruptedException ie){ 
			System.out.println("Problem with thread"); 
		} 
	} 
} 