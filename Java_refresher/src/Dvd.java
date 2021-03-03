
public class Dvd {
	private String genre;
	private String title;
	
	Dvd(){}
	Dvd(String genre, String title){
		this.genre=genre;
		this.title=title;
	}
	
	public boolean setGenre(String genre) {
		if(genre!=null) {
			this.genre=genre;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean setTitle(String title) {
		if(title!=null) {
			this.title=title;
			return true;
		}else {
			return false;
		}	
	}
	
	public String getGenre() { return genre;}
	public String getTitle() { return title;}
	
}
