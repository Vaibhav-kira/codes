package learning;

public class EvenThread extends Thread{ 
	public void run(){ 
		try{ 
			for (int i = 1; i <= 20; i++) { 
 
				if(i%2==0){ 
					System.out.println("Even Thread:\t"+i); 
					Thread.sleep(100); 
				} 
			} 
		}catch(InterruptedException ie){ 
			System.out.println("Problem with thread"); 
		} 
	} 
} 