import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
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

	// add word to dictionary
	// remove word from dictionary
	// search for word
	// sort dictionary

	// main method
	public static void main(String[] args) {
		// 2. JSON string to Java object
		Gson gson = new Gson();
				
//		String[] wordsArr = gson.fromJson(new FileReader("words.json", String.class), String.class);
//		ArrayList<String> words = new ArrayList<String>();

		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("words.json"));

	}
}
