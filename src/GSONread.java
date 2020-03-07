import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import com.google.gson.Gson;

public class GSONread {

	static Word[] wordObj;
	static Definition defObj;

	public static void main(String[] args) {
		returnWords(true);
	}

	public static List<Word> returnWords(boolean aToZ) {
		Gson gson = new Gson();

		try {
			BufferedReader br = new BufferedReader(new FileReader("words.json"));

			wordObj = gson.fromJson(br, Word[].class);
			defObj = gson.fromJson(br, Definition.class);

			List<Word> list = Arrays.asList(wordObj);
			if(aToZ == true) {
				list.sort(Comparator.comparing(Word::toString));
				System.out.println(defObj);
			} else {
				list.sort(Comparator.comparing(Word::toString).reversed());
				System.out.println(defObj);
			}
			return list;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
