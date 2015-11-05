import junit.framework.TestCase;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMovieListWithOneMovie extends TestCase {

	 private MovieList movieList = null;
	 private Movie starWars = null;
	 public void setUp() {
		 starWars = new Movie("Star Wars");
		 movieList = new MovieList();
		 movieList.add(starWars);
	 }@Test
	 public void testSize() {
		 assertEquals("Size of one item list should be 1.", 1, movieList.size());
	 }@Test
	 public static void main(String[] args) {
		 junit.textui.TestRunner.run(TestMovieListWithOneMovie.class);
	 }
}
