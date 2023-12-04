import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    @Test
    public void testGetTitle() {
        Movie movie = new Movie("Inception", "Warner Bros.", "Christopher Nolan", "Leonardo DiCaprio", 2010);
        assertEquals("Inception", movie.getTitle());
    }

    @Test
    public void testGetStudio() {
        Movie movie = new Movie("Inception", "Warner Bros.", "Christopher Nolan", "Leonardo DiCaprio", 2010);
        assertEquals("Warner Bros.", movie.getStudio());
    }

    @Test
    public void testGetDirector() {
        Movie movie = new Movie("Inception", "Warner Bros.", "Christopher Nolan", "Leonardo DiCaprio", 2010);
        assertEquals("Christopher Nolan", movie.getDirector());
    }

    @Test
    public void testGetMainActor() {
        Movie movie = new Movie("Inception", "Warner Bros.", "Christopher Nolan", "Leonardo DiCaprio", 2010);
        assertEquals("Leonardo DiCaprio", movie.getMainActor());
    }

    @Test
    public void testGetReleaseYear() {
        Movie movie = new Movie("Inception", "Warner Bros.", "Christopher Nolan", "Leonardo DiCaprio", 2010);
        assertEquals(2010, movie.getReleaseYear());
    }
}
