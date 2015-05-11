package model;

public class Quote {

	private int id;
	private String wording;
	private String author;
	
	public Quote(){};
	public Quote(int id, String wording, String author) {
		this.id = id;
		this.wording = wording;
		this.author = author;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWording() {
		return wording;
	}
	public void setWording(String wording) {
		this.wording = wording;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
