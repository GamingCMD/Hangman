package de.Schambes.Hangman;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Word {

	private final String word;
	private final char[] letters;

	private char[] lettersHidden;
	private String wordHidden;
	private final int length;

	private ArrayList<Character> revealed;

	public Word() {
		this(Utils.getWord());
	}

	public Word(String str) {
		revealed = new ArrayList<Character>();
		this.length = str.length();
		this.word = str.replaceAll("\\s", "_");
		this.letters = str.toCharArray();
		this.lettersHidden = word.replaceAll("[\\wßäöü&&[^0-9_]]", "-").toCharArray();
		this.wordHidden = new String(this.lettersHidden);
	}


	/**@return matches number of revealed characters, if -2, the character is invalid (all non-word characters), if -1, the character was looked up yet
	 * 
	 * */
	public int lookUp(char c) {

		c = Character.toLowerCase(c);

		if(Character.toString(c).matches("[^\\p{Alpha}&&[^äüöß]]")) {
			return -2;
		}

		String rev = new String();
		for(char r : this.revealed){
			rev = rev + r; 
		}

		if(Pattern.compile(Character.toString(c)).matcher(rev).find()) {
			return -1;
		}

		this.revealed.add(c);

		int count = 0;

		for(int i = 0; i < this.length; i++) {
			if(Character.toLowerCase(this.letters[i]) == c) {
				this.lettersHidden[i] = this.letters[i];
				count++;
			}
		}

		this.wordHidden = new String(lettersHidden);

		return count;
	}
	
	public boolean won() {
		return this.wordHidden.equals(word);
	}
	
	/**@return if output -1, the player hasn't won, else it represents the count of revealed letters*/
	public int lookUp(String str) {
		if(str.replace("_", " ").equalsIgnoreCase(this.word.replace("_", " "))) {
			int count = 0;
			for(int i = 0; i < this.length; i++) {
				if(this.lettersHidden[i] == '-' && this.lettersHidden[i] != this.letters[i]) {
					count++;
				}
			}
			
			this.lettersHidden = this.letters;
			this.wordHidden = this.word;
			
			return count;
		}
		
		return -1;
	}

	public String toString() {
		return this.wordHidden;
	}
	
	public int getLength() {
		return this.length;
	}

}
