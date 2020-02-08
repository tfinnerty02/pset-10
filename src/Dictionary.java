import java.util.LinkedHashMap;
import com.google.gson.*;

public class Dictionary {

	Gson gson = new Gson();
	LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
	dictionary = gson.fromJson();
	
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
