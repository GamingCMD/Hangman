package de.Schambes.Hangman;

public class Utils {
	
	private static String[] words = {
			"hello",
			"test",
	};
			
	
	public static String getWord() {
		return words[(int) (Math.random()*(words.length - 1))];
	}
	
}
