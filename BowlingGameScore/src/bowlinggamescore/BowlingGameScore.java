package bowlinggamescore;

import java.util.Scanner;

public class BowlingGameScore {

    public static void main(String[] args) {
        System.out.println("Please enter a valid sequence of rolls  separated by a comma in order to get the score");
        
        //read the entry
        Scanner sc = new Scanner (System.in);
        String sequence = sc.nextLine();
        Game partie = new Game(sequence);
        
        //print the result
        System.out.println("score : "+partie.score());
    }
    
}
