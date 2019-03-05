
public class Main {

	public static void main(String[] args) {
		
		calculateScore(true, 800, 5, 100); // this way we can calculate method name calculateScore() and pass it values
		
		calculateScore(true,1000, 8, 200);

	}
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("Your final score is :" + finalScore );
		}
	}

}
