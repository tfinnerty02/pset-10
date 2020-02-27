import java.util.List;

public class Word {

	private String word;
	private Definition[] definitions;
	private List<String> synonyms;
	private List<String> antonyms;

	public String getWord() {
		return word;
	}

	public List<String> getSynonyms() {
		return synonyms;
	}

	public List<String> getAntonyms() {
		return antonyms;
	}

	public Definition[] getDefinitions() {
		return definitions;
	}

	@Override
	public String toString() {
		return word;
	}

}