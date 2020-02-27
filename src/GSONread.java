import java.io.*;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;

public class GSONread {

	static Word[] wordObj;
	
	public static void main(String[] args) {
		returnWords();
	}
	
	public static List<Word> returnWords() {
		Gson gson = new Gson();
		   
		  try {
		   BufferedReader br = new BufferedReader(new FileReader("words.json"));
		   
		   wordObj = gson.fromJson(br,  Word[].class);
		   
//		   System.out.println(Arrays.deepToString(wordObj));
		   
		   List<Word> list = Arrays.asList(wordObj);
//		   return Arrays.deepToString(wordObj);
		   return list;
		   
//		   for(Word word: wordObj) {
//			   System.out.println(word);
//		   }
		   
		  
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		return null;
	}
}
