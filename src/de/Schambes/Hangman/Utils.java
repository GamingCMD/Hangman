package de.Schambes.Hangman;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Utils {
	
	private ArrayList<String> words = new ArrayList<>();
	
	private Utils() {
		// TODO Auto-generated constructor stub
	}
	
	private void update() throws IOException {
		//Serverconnection
		ArrayList<String> words = new ArrayList<>();
		words.add("Server");
		//
		this.words = words;
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("res.jps")));
		out.writeObject(this.words);
		out.close();
	}
		
	
	public static String getWord() {
		Utils u = new Utils();
		try {
			u.update();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			u.load();
		} catch (Exception e) {
			// TODO: handle exception
			return "Sorry";
		}
		int r = (int) (Math.random()*100)+1;
		return u.words.get(r%u.words.size());
	}
	
	@SuppressWarnings("unchecked")
	private void load() throws IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("res.jps")));
		this.words = (ArrayList<String>) in.readObject();
		in.close();
	}
	
}
