import org.junit.*;
import static org.junit.Assert.*;
import junit.framework.TestCase;

public class TestMovieListWithEmptyList extends TestCase{
	
	 private MovieList movieList = null;
	 
	 @Before
	 public void setUp() {
	 movieList = new MovieList();
	 }
	 
	 @Test
	 public void testSize() {
		 assertEquals("Size of empty movie list should be 0.", 0, movieList.size());
	 }
 
	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestMovieListWithEmptyList.class);
		//doesn't seem to work without 'TestCase'
	}
}