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



	

	// add word to dictionary
	// remove word from dictionary
	// search for word
	// sort dictionary

	// main method
	public static void main(String[] args) {
		// 2. JSON string to Java object
		Gson gson = new Gson();
		
		String json = "{'word' : 'scatter'}";
		String object = gson.fromJson(json, String.class);	
		
		System.out.println(object);
		
		

	}
}
