import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.google.gson.Gson;

public class GSONread {

	static Word[] wordObj;

	public static void main(String[] args) {
		returnWords(true);
	}

	public static ArrayList<Word> returnWords(boolean aToZ) {
		Gson gson = new Gson();

		try {
			BufferedReader br = new BufferedReader(new FileReader("words.json"));

			List<Word> list = Dictionary.getWords();

			Collections.sort(list, new Comparator<Word>() {
				@Override
				public int compare(Word word2, Word word1) {

					return word1.word.compareTo(word2.word);
				}
			});

			ArrayList<Word> sortedWords = new ArrayList(list);

			if (aToZ) {
				ArrayList<Word> temp = new ArrayList<Word>();
				for (int i = sortedWords.size() - 1; i > -1; i--) {
					temp.add(sortedWords.get(i));
				}
				sortedWords = temp;
			}

			Dictionary.editJson(sortedWords);

			return sortedWords;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}