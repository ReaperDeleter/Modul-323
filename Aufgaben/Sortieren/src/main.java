import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {

    public static void main(String[] args) {

        /*
         * DATENGENERIERUNG
         * Es werden 100 zufällige Filmdatensätze erstellt.
         */

        List<Film> filme = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {

            filme.add(
                    new Film(
                            "Film " + i,
                            1980 + (int) (Math.random() * 45),
                            Math.round(Math.random() * 100) / 10.0,
                            Genre.values()[(int) (Math.random() * Genre.values().length)],
                            new Regisseur(
                                    "Regisseur " + i,
                                    "Land " + ((i % 5) + 1)
                            )
                    )
            );
        }

        /*
         * ====================================================
         * TEIL 1 - FUNKTIONALES SORTIEREN
         * ====================================================
         * - Comparator Klasse
         * - Anonyme Klasse
         * - Lambda Expression
         * - Comparator Chain
         * ====================================================
         */

        // TEIL 1.1 - Comparator Klasse

        System.out.println("=================================");
        System.out.println("Comparator Klasse");
        System.out.println("=================================");

        Collections.sort(filme, new FilmTitelComparator());

        filme.stream().limit(10).forEach(System.out::println);

        // TEIL 1.2 - Anonyme Klasse

        System.out.println("\n=================================");
        System.out.println("Anonyme Klasse");
        System.out.println("=================================");

        Collections.sort(filme, new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                return Integer.compare(
                        f1.getErscheinungsjahr(),
                        f2.getErscheinungsjahr()
                );
            }
        });

        filme.stream().limit(10).forEach(System.out::println);

        // TEIL 1.3 - Lambda Expression

        System.out.println("\n=================================");
        System.out.println("Lambda Expression");
        System.out.println("=================================");

        filme.sort(
                (f1, f2) ->
                        Double.compare(
                                f1.getBewertung(),
                                f2.getBewertung()
                        )
        );

        filme.stream().limit(10).forEach(System.out::println);

        // TEIL 1.4 - Comparator Chain

        System.out.println("\n=================================");
        System.out.println("Comparator Chain");
        System.out.println("=================================");

        filme.sort(
                Comparator
                        .comparing(Film::getGenre)
                        .thenComparing(Film::getTitel)
        );

        filme.stream().limit(10).forEach(System.out::println);

        /*
         * ====================================================
         * TEIL 2 - VERSCHIEDENE SORTIERUNGEN
         * ====================================================
         * - Natural Order
         * - Reverse Order
         * - Mehrstufige Sortierung
         * - Sortierung aller Attribute
         * ====================================================
         */

        // TEIL 2.1 - Natural Order (Comparable)

        System.out.println("\n=================================");
        System.out.println("Natural Order");
        System.out.println("=================================");

        Collections.sort(filme);

        filme.stream().limit(10).forEach(System.out::println);

        // TEIL 2.2 - Reverse Order

        System.out.println("\n=================================");
        System.out.println("Reverse Order");
        System.out.println("=================================");

        Collections.sort(
                filme,
                Collections.reverseOrder()
        );

        filme.stream().limit(10).forEach(System.out::println);

        // TEIL 2.3 - Mehrstufige Sortierung

        System.out.println("\n=================================");
        System.out.println("Mehrstufige Sortierung");
        System.out.println("=================================");

        filme.sort(
                Comparator
                        .comparing(Film::getGenre)
                        .thenComparing(Film::getErscheinungsjahr)
                        .thenComparing(Film::getBewertung)
        );

        filme.stream().limit(10).forEach(System.out::println);

        // TEIL 2.4 - Sortierung nach Regisseur

        System.out.println("\n=================================");
        System.out.println("Sortierung nach Regisseur");
        System.out.println("=================================");

        filme.sort(
                Comparator.comparing(
                        f -> f.getRegisseur().getName()
                )
        );

        filme.stream().limit(10).forEach(System.out::println);
    }
}