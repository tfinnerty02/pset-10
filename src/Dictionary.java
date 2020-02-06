import java.util.LinkedHashMap;

public class Dictionary {

	LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
	
	// add word to dictionary
	public void addWord(String word) {
		dictionary.put(word, word);
	}
	
	// remove word from dictionary
	public void removeWord(String word) {
		dictionary.remove(word);
	}
	
	public static void main(String[] args) {
		System.out.println("h");
	}
}
