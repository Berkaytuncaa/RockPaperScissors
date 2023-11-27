package paket;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String playerMove = "";
		
		String[] rps = {"rock","paper","scissors"};
		String computerMove;
		
	    int score1 = 0;
	    int score2 = 0;
	    
	    System.out.print("Please enter how many rounds you want to play: ");
	    int round = sc.nextInt();
	    sc.nextLine();
	    
	    for(int i = 0; i < round; i++) {
	    	
	    	while(true) {
	    		computerMove = rps[new Random().nextInt(rps.length)];
	    		System.out.println("Please enter your move (rock, paper, scissors)");
	    		playerMove = sc.nextLine();
	    		if(playerMove.equals("rock") || playerMove.equals("paper") ||  playerMove.equals("scissors")) {
	    			break;
	    		}
	    		System.out.println(playerMove + "is not a valid move.");
	    	}
	    	
	    	System.out.println("Computer plays "+ computerMove);
	    	
	    	if(playerMove.equals("rock") && computerMove.equals("scissors")) {
	    		System.out.println("You WIN this round!");
	    		score1++;
	    	}
	    	
	    	else if(playerMove.equals("paper") && computerMove.equals("rock")) {
	    		System.out.println("You WIN this round!");
	    		score1++;
	    	}
	    	
	    	else if(playerMove.equals("scissors") && computerMove.equals("paper")) {
	    		System.out.println("You WIN this round!");
	    		score1++;
	    	}
	    	
	    	else if(playerMove.equals(computerMove)) {
	    		System.out.println("It's a DRAW!");
	    	}
	    	
	    	else {
	    		System.out.println("You LOSE this round!");
	    		score2++;
	    	}
	    }
	    
	    if(score1 > score2) {
	    	System.out.println("Your score is: "+score1);
	    	System.out.println("Computer's score is: "+score2);
	    	System.out.println("Congrats. You WIN the game");
	    }
	    
	    else if(score1 < score2) {
	    	System.out.println("Your score is: "+score1);
	    	System.out.println("Computer's score is: "+score2);
	    	System.out.println("You LOSE the game. Good luck next time!");
	    }
	    
	    else if(score1 == score2) {
	    	System.out.println("Your score is: "+score1);
	    	System.out.println("Computer's score is: "+score2);
	    	System.out.println("The game is a DRAW!");
	    }
	    
	}

}
