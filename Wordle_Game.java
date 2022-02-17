import java.util.*;
public class Wordle_Game {

	public static void main(String[] args) {
		CheckWord charCheck = new CheckWord();
		String answer = "";	
		Scanner input = new Scanner(System.in);
		
		do {
		ranWord ranW = new ranWord();
		ArrayList<Character> Alphabet = new ArrayList<>();
		
		for(int i = 97; i <= 122; i++) {
			Alphabet.add((char)i);
		}
		
		System.out.println("WELCOME TO WARDLE");
		System.out.println("X = letter not in word");
		System.out.println("# = letter is in word but in the wrong place");
		System.out.println("$ = letter is in word and is in the right place");
		System.out.println();
	
		//gets Random 5 letter word.
		int ranVal = ranW.getRanVal();
		String WordofDay = ranW.getRanWord(ranVal);
		
		//String WordofDay = "pizza"; //use to set a specific word
		System.out.println();
		System.out.println("LETTERS NOT USED: ");
		System.out.println(Alphabet);
		//iterates 6 times.
		for(int i = 0; i < 6; i++) {
			ranWord check = new ranWord();
			//
			
			System.out.print("\nEnter a 5 letter word: ");
			String myWord = input.next();
			//
				if(check.checkWord(myWord) == true) {
					char[] wCheck = charCheck.Check$(myWord, WordofDay);
					System.out.print("Word check:            ");
					for(int j = 0; j < wCheck.length; j++ ) {
						System.out.print(wCheck[j]);
					}
					
					System.out.println();
					System.out.println("\nYou have "+ (6-(i+1)) + " more attempts");
					
					if(myWord.equals(WordofDay)) {
						System.out.println("\nCORRECT!!");
						break;
					}	
					System.out.println(charCheck.getAlphabet(Alphabet));
					
				}
				else {
					
					System.out.println("\nThat is not on the word list");
					System.out.println("Try again");
					i--;
				}
		}
		System.out.println();
		System.out.println("The word was: " + WordofDay);
		System.out.println();
		System.out.print("\nWould you like to play again? ");
		answer = input.next();
		System.out.println();
		} while(answer.equalsIgnoreCase("yes"));	
	}
}
