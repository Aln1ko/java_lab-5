import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Клас для каталогу фільмів, який реалізує інтерфейс {@link ex21interface}.
 * Забезпечує функціонал додавання, видалення та сортування фільмів за назвою кіностудії.
 */
public class MovieCatalog implements ex21interface {

    /** Список фільмів у каталозі */
    private List<Movie> movies;

    /**
     * Конструктор класу MovieCatalog. Ініціалізує список фільмів.
     */
    public MovieCatalog() {
        movies = new ArrayList<>();
    }

    /**
     * Додає фільм до каталогу.
     *
     * @param movie фільм для додавання
     */
    @Override
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    /**
     * Видаляє фільм з каталогу.
     *
     * @param movie фільм для видалення
     */
    @Override
    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    /**
     * Отримує відсортований за назвою кіностудії список фільмів.
     *
     * @return відсортований список фільмів
     */
    @Override
    public List<Movie> getMoviesSortedByStudio() {
        movies.sort(Comparator.comparing(Movie::getStudio));
        return movies;
    }
}
