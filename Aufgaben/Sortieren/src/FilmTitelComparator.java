import java.util.Comparator;

public class FilmTitelComparator implements Comparator<Film> {

    @Override
    public int compare(Film f1, Film f2) {
        return f1.getTitel().compareTo(f2.getTitel());
    }
}