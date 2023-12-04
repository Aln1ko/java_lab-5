import java.util.List;
import java.util.Scanner;

/*
Створити клас для каталогу фільмів (поля: назва, кіностудія, режисер,
виконавець головної ролі, рік виходу). Передбачити сортування за назвою кіностудії.
 */
public class ex21 {
    public static void main(String[] args) {
        MovieCatalog catalog = new MovieCatalog();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        List<Movie> movies;

        while (!exit) {
            System.out.println("1. Додати фільм");
            System.out.println("2. Видалити фільм");
            System.out.println("3. Вивести фільми, відсортовані за кіностудією");
            System.out.println("4. Вийти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистити буфер після nextInt()

            switch (choice) {
                case 1:
                    System.out.println("Введіть назву фільму:");
                    String title = scanner.nextLine();

                    System.out.println("Введіть назву кіностудії:");
                    String studio = scanner.nextLine();

                    System.out.println("Введіть ім'я режисера:");
                    String director = scanner.nextLine();

                    System.out.println("Введіть ім'я головного актора:");
                    String mainActor = scanner.nextLine();

                    System.out.println("Введіть рік виходу:");
                    int releaseYear = scanner.nextInt();
                    scanner.nextLine();

                    Movie movie = new Movie(title, studio, director, mainActor, releaseYear);
                    catalog.addMovie(movie);
                    System.out.println("Фільм додано до каталогу.");
                    break;
                case 2:
                    System.out.println("Введіть назву фільму для видалення:");
                    title = scanner.nextLine();

                     movies = catalog.getMoviesSortedByStudio();
                    for (Movie mov : movies) {
                        if (mov.getTitle().equals(title)) {
                            catalog.removeMovie(mov);
                            System.out.println("Фільм видалено з каталогу.");
                            break;
                        }
                    }
                    System.out.println("Фільм з такою назвою не знайдено.");
                    break;
                case 3:
                    movies = catalog.getMoviesSortedByStudio();
                    if (movies.isEmpty()) {
                        System.out.println("Каталог фільмів порожній.");
                    } else {
                        System.out.println("Фільми, відсортовані за кіностудією:");
                        for (Movie mov : movies) {
                            System.out.println(mov.getTitle() + " - " + mov.getStudio());
                        }
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Введено невірний вибір, спробуйте знову.");
            }
        }
        scanner.close();
    }

}
