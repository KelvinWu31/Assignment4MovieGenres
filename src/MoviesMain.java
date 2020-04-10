/*README 
 * 
 * Class: Movie Main (INCOMPLETE)
 * 
 * Description: The Main Method reads in a csv file and extracts the genres and movies from the file.
 * The extracted data is then put into separate linked lists. which are then filtered through a 
 * HashMap to count how many times a specific genre is repeated. 
 * 
 * OUTPUT: 
 * NOT READY/ Unsure what to do with releaseYear. Will be updated.
 * 
 */
import java.util.*; 
import java.io.*; 

public class MoviesMain {
	public static void main(String[] args) throws Exception {
		
		File file = new File ("src/movies.csv");
		String row; 
		
		// storing the genre column
		List<String> genres = new LinkedList<>(); 
		List<String> movies = new LinkedList<>(); 
		
		BufferedReader readFile = new BufferedReader(new FileReader(file));  // calls on BufferedReader to read in the csv file 
		
		while ((row = readFile.readLine()) != null) { 
			String [] data = row.split(",");                                // splits all incoming data by commas
			String extractedGenres = data[2];		                      // only reads in data of column 1 & 2 since it holds the genres and movies
			String extractedMovies = data[1]; 
			movies.add(extractedMovies); 
			genres.add(extractedGenres);                                   // adds the extractedGenres and extractedMovies into the linkedlist above
			movies.remove("movies");
			genres.remove("genres");                                       // removes "genres" and "movies" from the data 
		} // end of while loop 
		readFile.close();                                                  // closes readFile to prevent leaking
		
		List <String> uniqueGenres = new ArrayList <>();        
		
		for(int i = 0; i < genres.size(); i++) {                         // this searches the genres linkedlist and finds all the unique genres 
			String current = genres.get(i); 							 
			String data[] = current.split("\\|");
			for (int j = 0; j < data.length; j++) { 
				uniqueGenres.add(data[j]);                              // adds it onto an ArrayList of uniqueGenres   
			} // end of inner for loop
		} // end of outer for loop
		
		Collections.sort(uniqueGenres, String.CASE_INSENSITIVE_ORDER);
		System.out.println(uniqueGenres);                              // prints out the unique genres that the arraylist holds
		
		HashMap <String, Integer> genreMap = new HashMap <String, Integer>();
	
		for (String string: uniqueGenres) { 
			
			if (!genreMap.containsKey(string)) {                      // counts out all the times a unique genre is repeated
				genreMap.put(string, 0); 
			}
		genreMap.put(string, genreMap.get(string) + 1);             
		}  // end of for loop
		
		for (String string: genreMap.keySet()) {
			System.out.println( string + " repeats " + genreMap.get(string) + " times."); 
		} // end of for loop
	
		ArrayList <String> releaseYearList = new ArrayList<>(); 
		
		for (int m = 0; m < movies.size(); m++) { 
			String current = movies.get(m);
			String numberOfYears = current.substring(current.length() - 6); 
			releaseYearList.add(numberOfYears); 
		}
		
		for(int j = 0; j < releaseYearList.size(); j++) { 
		
		}
	} // end of main method
	
} // end of public class
