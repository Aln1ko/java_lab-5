import java.util.Comparator;

/**
 * Class representing a movie with its primary characteristics.
 */
public class Movie {

    /** Title of the movie */
    private String title;
    /** Studio name */
    private String studio;
    /** Director's name */
    private String director;
    /** Main actor's name */
    private String mainActor;
    /** Release year of the movie */
    private int releaseYear;

    /**
     * Constructor for the Movie class.
     *
     * @param title       movie title
     * @param studio      studio name
     * @param director    director's name
     * @param mainActor   main actor's name
     * @param releaseYear movie's release year
     */
    Movie(String title, String studio, String director, String mainActor, int releaseYear) {
        this.title = title;
        this.studio = studio;
        this.director = director;
        this.mainActor = mainActor;
        this.releaseYear = releaseYear;
    }

    /**
     * Default constructor for the Movie class.
     * Initializes the movie's fields with default values.
     */
    Movie() {
        this.title = "title";
        this.studio = "studio";
        this.director = "director";
        this.mainActor = "mainActor";
        this.releaseYear = 2005;
    }

    /**
     * Returns the title of the movie.
     *
     * @return movie title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the studio name.
     *
     * @return studio name
     */
    public String getStudio() {
        return studio;
    }

    /**
     * Returns the director's name.
     *
     * @return director's name
     */
    public String getDirector() {
        return director;
    }

    /**
     * Returns the main actor's name.
     *
     * @return main actor's name
     */
    public String getMainActor() {
        return mainActor;
    }

    /**
     * Returns the release year of the movie.
     *
     * @return release year of the movie
     */
    public int getReleaseYear() {
        return releaseYear;
    }
}
