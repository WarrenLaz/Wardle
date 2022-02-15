import java.util.*;
import java.io.*;

public class ranWord {
	Scanner input;
	FileInputStream FIS;
	Random ran;

	public ranWord() {
		//initializing data.
		try {
			FIS = new FileInputStream("Word_Data.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		
		ran = new Random();
		input = new Scanner(FIS);
	}

	public int getRanVal() {
		int RanVal = ran.nextInt(5757);
		return RanVal;	
	}

	public String getRanWord(int RanVal) {
		String WordofDay = " ";
		for(int i = 0; i < 5758; i++) {
			if(i==RanVal) {
				WordofDay = input.next();
				break;
			}
			input.next();
		}
		return WordofDay;
	}
	
	public boolean checkWord(String myWord) {
		boolean isInList = false;
		for(int i = 0; i < 5758; i++) {
			String wordCheck = input.next();
			if(wordCheck.equalsIgnoreCase(myWord)) {
				isInList = true;
				break;
			}
			
		}
		return isInList;
	}
	
	

}
