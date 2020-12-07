package Live;
import music.Playable;
import music.string.Veena;
import music.wind.Guitar;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Part a of question Create an instance of Veena and call play() method
		
		Veena obj = new Veena();
		obj.play();
		
		// Part b of question Create an instance of Guitar and call play() method
		
		Guitar obj1 = new Guitar();
		obj1.play();
		
		// Part c of question Place the above instances in a variable of type Playable and then call play().
		
		Playable a,b;
		a= new Veena();
		b= new Guitar();
		a.play();
		b.play();
		
		
		
	}

}
