public class Words {
	
	public String word;
	public String partOfSpeech;
	public String ;

	public String getWord() {
		return word;
	}
	
	public String getPartOfSpeech() {
		return partOfSpeech;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}