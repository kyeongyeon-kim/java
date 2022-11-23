
public class Movie {
	// 영화제목
	private String title;
	// 평점
	private double score;
	// 감독
	private String directorName;
	// 발표된 연도
	private int publishYear;
	
	public Movie(String title, double score, String directorName, int publishYear) {
		this.title = title;
		this.score = score;
		this.directorName = directorName;
		this.publishYear = publishYear;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", score=" + score + ", directorName=" + directorName + ", publishYear="
				+ publishYear + "]";
	}
}
