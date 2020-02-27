import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.gson.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
	public static void main(String[] args) throws IOException {
		String jsonFileString = new String(Files.readAllBytes(Paths.get("words.json")));
		System.out.println(jsonFileString);

		Gson gson = new Gson();
		Word[] userArray = gson.fromJson(jsonFileString, Word[].class);
//		System.out.println(userArray);

	}
}
