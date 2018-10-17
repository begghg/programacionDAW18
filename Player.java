package agosto18;

public class Player {
	private static String game = "Super Mario Bros";
	 
    private int X;
    private int Y;
 
    public Player(int x, int y){
        this.X = x;
        this.Y = y;
    }
 
    public void move(){
        X++;
        Y++;
    }
 
    public static void changeGame(String nextGame){
        game = nextGame;
    }
 
    @Override
    public String toString() {
        return String.format("Game: %s, X : %d, Y: %d ", game, X, Y);
    }


}
