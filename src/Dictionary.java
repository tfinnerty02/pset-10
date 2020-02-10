import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import com.google.gson.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Dictionary {

	/* * Java Method to read JSON From File */
	public static String readJson(String file) {
		JSONParser parser = new JSONParser();
		
		try {
			
			Object obj = parser.parse(new FileReader("words.json"));
			JSONObject jsonObject = (JSONObject) obj;
			String word = (String) jsonObject.get("word");
			return word;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
		HashMap<String, String> dictionary = new HashMap<String,String>();

	// add word to dictionary
	public void addWord(String word) {
		dictionary.put(word, word);
	}

	// remove word from dictionary
	public void removeWord(String word) {
		dictionary.remove(word);
	}

	// main method
	public static void main(String[] args) {
		System.out.println(readJson("words.json"));

		Gson gson = new Gson();

	}
}
