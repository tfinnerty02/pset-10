import java.util.ArrayList;

public class Word {

	public String word;
	public ArrayList<Definition> definitions;
	public ArrayList<String> synonyms;
	public ArrayList<String> antonyms;

	public String getWord() {
		return word;
	}
	
	public ArrayList<Definition> getDefinitions() {
		return definitions;
	}

	public ArrayList<String> getSynonyms() {
		return synonyms;
	}

	public ArrayList<String> getAntonyms() {
		return antonyms;
	}

}