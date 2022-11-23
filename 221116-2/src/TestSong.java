public class TestSong {
	public static void main(String[] args) {
		Song s1 = new Song("Outward Bound", "Nana", 180);
		Song s2 = new Song("Jambalya", "Carpenters");
		Song s3 = new Song("Yesterday");
		Song s4 = new Song();
		
		System.out.println(s1.getTitle());
		System.out.println(s1.getArtist());
		System.out.println(s1.getLength());
		
		System.out.println(s2.getTitle());
		System.out.println(s2.getArtist());
		System.out.println(s2.getLength());
		
		System.out.println(s3.getTitle());
		System.out.println(s3.getArtist());
		System.out.println(s3.getLength());
		
		System.out.println(s4.getTitle());
		System.out.println(s4.getArtist());
		System.out.println(s4.getLength());
		
	}

}
