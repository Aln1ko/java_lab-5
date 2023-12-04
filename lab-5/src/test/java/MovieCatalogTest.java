import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class MovieCatalogTest {

    private MovieCatalog movieCatalog;

    @BeforeEach
    public void setUp() {
        movieCatalog = new MovieCatalog();
    }

    @Test
    public void testAddMovie() {
        Movie movie = new Movie("Inception", "Warner Bros.", "Christopher Nolan", "Leonardo DiCaprio", 2010);
        movieCatalog.addMovie(movie);
        List<Movie> movies = movieCatalog.getMoviesSortedByStudio();
        assertEquals(1, movies.size());
        assertTrue(movies.contains(movie));
    }

    @Test
    public void testRemoveMovie() {
        Movie movie = new Movie("Inception", "Warner Bros.", "Christopher Nolan", "Leonardo DiCaprio", 2010);
        movieCatalog.addMovie(movie);
        movieCatalog.removeMovie(movie);
        List<Movie> movies = movieCatalog.getMoviesSortedByStudio();
        assertTrue(movies.isEmpty());
    }

    @Test
    public void testGetMoviesSortedByStudio() {
        Movie movie1 = new Movie("Inception", "Warner Bros.", "Christopher Nolan", "Leonardo DiCaprio", 2010);
        Movie movie2 = new Movie("The Dark Knight", "Warner Bros.", "Christopher Nolan", "Christian Bale", 2008);
        Movie movie3 = new Movie("The Godfather", "Paramount Pictures", "Francis Ford Coppola", "Marlon Brando", 1972);

        movieCatalog.addMovie(movie1);
        movieCatalog.addMovie(movie2);
        movieCatalog.addMovie(movie3);

        List<Movie> movies = movieCatalog.getMoviesSortedByStudio();

        assertEquals("Paramount Pictures", movies.get(0).getStudio());
        assertEquals("Warner Bros.", movies.get(1).getStudio());
        assertEquals("Warner Bros.", movies.get(2).getStudio());
    }
}
