package agosto18;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Player p1 = new Player(10, 10);
	        Player p2 = new Player(20, 20);
	     
	        // calling non-static method move() on p1
	        p1.move();
	     
	        // let's print position of p1 and p2
	        // only p1 should have moved, no impact on p2
	        System.out.println("P1 : " + p1);
	        System.out.println("P2 : " + p2);
	     
	        // calling static method on p2
	        p2.changeGame("Cricket Brian Lara 1997");
	        p1.move();
	     
	        // should have affected both p1 and p2
	        System.out.println("P1 : " + p1);
	        System.out.println("P2 : " + p2);
	     
	
	}

}
