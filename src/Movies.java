/*README 
 * 
 * Class: Movies
 * 
 * Description: Set up a class of Movies that sets and gets all data including title, genre and release year. 
 * The main method can call the constructor and pass all the data listed above to the Movies Class. This Class 
 * allows them to store the data and call on the data when necessary. 
 * 
 */
public class Movies {
	
	private String title; 
	private String[] genres; 
	private int releaseYear; 
	
	// no args-contructor{ 
	
	public Movies () { 
	 // empty	
	}
	
	// constructor: 
	public Movies(String title, String[] genres, int releaseYear) { 
		this.title = title;
		this.genres = genres; 
		this.releaseYear = releaseYear; 
	}
	
	//setters: 
	public void setTitle(String title) { 
		this.title = title; 
	}

	public void setGenres(String[] genres) { 
		this.genres = genres; 	
	}
	
	public void setReleaseYear(int releaseYear) { 
		this.releaseYear = releaseYear; 
	}
	
	//getters: 
	public String getTitle () { 
		return title; 
	}
	
	public String[] getGenres () {
		return genres; 
	}
	
	public int releaseYear() { 
		return releaseYear; 
	}
	

}
