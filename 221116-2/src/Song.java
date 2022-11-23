public class Song {
	private String title;
	private String artist;
	private int length;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Song(String title, String artist, int length) {
		this.title = title;
		this.artist = artist;
		this.length = length;
	}
	public Song(String title, String artist) {
		this(title, artist, 180);
		
	}
	public Song(String title) {
		this(title, "무명", 180);
	}
	public Song() {
		this("노-타이틀", "무명", 180);
	}
}
