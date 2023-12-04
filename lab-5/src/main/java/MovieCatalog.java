import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Class for a movie catalog that implements the {@link ex21interface} interface.
 * Provides functionality to add, remove, and sort movies by studio name.
 */
public class MovieCatalog implements ex21interface {

    /** List of movies in the catalog */
    private List<Movie> movies;

    /**
     * Constructor for the MovieCatalog class. Initializes the list of movies.
     */
    public MovieCatalog() {
        movies = new ArrayList<>();
    }

    /**
     * Adds a movie to the catalog.
     *
     * @param movie movie to be added
     */
    @Override
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    /**
     * Removes a movie from the catalog.
     *
     * @param movie movie to be removed
     */
    @Override
    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    /**
     * Gets a sorted list of movies by studio name.
     *
     * @return sorted list of movies
     */
    @Override
    public List<Movie> getMoviesSortedByStudio() {
        movies.sort(Comparator.comparing(Movie::getStudio));
        return movies;
    }
}
