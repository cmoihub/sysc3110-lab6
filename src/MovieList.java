import java.util.*;

public class MovieList {

	private Collection<Movie> movies; 
	@SuppressWarnings("unused")
	private int numberOfMovies = 0;
	
	public MovieList() {
		movies = new ArrayList<Movie>();
	}

	 public int size() {
		 return movies.size();
		 }
	 
	public void add(Movie movie) {
		numberOfMovies++;
		movies.add(movie);
	}

	public boolean contains(Movie movie) {
		 return movies.contains(movie);
		}
}