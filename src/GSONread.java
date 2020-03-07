import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import com.google.gson.Gson;

public class GSONread {

	static Word[] wordObj;

	public static void main(String[] args) {
		returnWords(true);
	}

	public static List<Word> returnWords(boolean aToZ) {
		Gson gson = new Gson();

		try {
			BufferedReader br = new BufferedReader(new FileReader("words.json"));

			wordObj = gson.fromJson(br, Word[].class);

			List<Word> list = Arrays.asList(wordObj);

			// sorts ArrayList of words based on boolean parameter aToZ
			if (aToZ == true) {
				list.sort(Comparator.comparing(Word::toString));
			} else {
				list.sort(Comparator.comparing(Word::toString).reversed());
			}

			return list;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
