
public class ifElseLoop {

	public static void main(String[] args) {
	
		int playerOneScore = 20;
		int playerTwoScore = 30;
		int playerThreeScore = 40;
		int totalScore;
	
		
		if(playerOneScore > playerTwoScore) {
			
			System.out.println("Player one score more than player two");
			totalScore = playerOneScore + playerTwoScore;
			System.out.println("Total score is " +totalScore);
	
		}else if (playerTwoScore > playerThreeScore) {
			
			System.out.println("Player two score more than player three");
			totalScore = playerOneScore + playerTwoScore+ playerThreeScore;
			System.out.println("Total score is " +totalScore);
		
		}else
			
			System.out.println("Game is still on");
		}

	}


