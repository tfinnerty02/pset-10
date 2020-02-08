import java.io.FileReader;
import java.util.HashMap;
import com.google.gson.*;

public class Dictionary {

	Gson gson = new Gson();
	HashMap<String, String> dictionary = new Gson().fromJson(new FileReader("words.json"), HashMap.class);

	
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
