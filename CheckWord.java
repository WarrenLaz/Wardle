
public class CheckWord {

	boolean isInWord;
	char[] myWord;
	char[] WordofDay;
	char[] key;

	public CheckWord(){
		isInWord = false;
		myWord = new char[5];
		WordofDay = new char[5];
		key = new char[5];
		
	}

	public char[] Check$(String myWord, String WordofDay) {

		for(int i = 0; i < myWord.length(); i++) {
			this.myWord[i] = myWord.charAt(i);
			this.WordofDay[i] = WordofDay.charAt(i);
		}
		
		for(int i = 0; i < this.myWord.length; i++) {
			
			if(this.myWord[i] == this.WordofDay[i]) {
				key[i] = '$';
			}
			else {
				key[i] = 'X';
			}
		}
		
		for(int i = 0; i < this.myWord.length; i++) {
			for(int j = 0; j < this.myWord.length; j++) {
				if(this.WordofDay[i] == this.myWord[j] && i != j && this.WordofDay[i] != this.WordofDay[j]) {
					key[j] = '#';
					break;
				}
				
			}
		}
		
		
		return key;

	}

}
