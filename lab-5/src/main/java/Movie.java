import java.util.Comparator;

/**
 * Клас, що представляє фільм з основними характеристиками.
 */
public class Movie {

    /** Назва фільму */
    private String title;
    /** Назва кіностудії */
    private String studio;
    /** Ім'я режисера */
    private String director;
    /** Ім'я головного актора */
    private String mainActor;
    /** Рік виходу фільму */
    private int releaseYear;

    /**
     * Конструктор класу Movie.
     *
     * @param title       назва фільму
     * @param studio      назва кіностудії
     * @param director    ім'я режисера
     * @param mainActor   ім'я головного актора
     * @param releaseYear рік виходу фільму
     */
    Movie(String title, String studio, String director, String mainActor, int releaseYear) {
        this.title = title;
        this.studio = studio;
        this.director = director;
        this.mainActor = mainActor;
        this.releaseYear = releaseYear;
    }

    /**
     * Конструктор класу Movie за замовчуванням.
     * Ініціалізує поля фільму стандартними значеннями.
     */
    Movie() {
        this.title = "title";
        this.studio = "studio";
        this.director = "director";
        this.mainActor = "mainActor";
        this.releaseYear = 2005;
    }

    /**
     * Повертає назву фільму.
     *
     * @return назва фільму
     */
    public String getTitle() {
        return title;
    }

    /**
     * Повертає назву кіностудії.
     *
     * @return назва кіностудії
     */
    public String getStudio() {
        return studio;
    }

    /**
     * Повертає ім'я режисера.
     *
     * @return ім'я режисера
     */
    public String getDirector() {
        return director;
    }

    /**
     * Повертає ім'я головного актора.
     *
     * @return ім'я головного актора
     */
    public String getMainActor() {
        return mainActor;
    }

    /**
     * Повертає рік виходу фільму.
     *
     * @return рік виходу фільму
     */
    public int getReleaseYear() {
        return releaseYear;
    }
}
