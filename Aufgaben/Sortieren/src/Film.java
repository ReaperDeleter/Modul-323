/*
 * Datenklasse Film
 *
 * Attribute:
 * - titel (String)
 * - erscheinungsjahr (int)
 * - bewertung (double)
 * - genre (Genre)
 * - regisseur (Regisseur)
 *
 * Die Klasse implementiert Comparable<Film>
 * für die Natural Order Sortierung nach Titel.
 */

public class Film implements Comparable<Film> {

    private String titel;
    private int erscheinungsjahr;
    private double bewertung;
    private Genre genre;
    private Regisseur regisseur;

    public Film(String titel,
                int erscheinungsjahr,
                double bewertung,
                Genre genre,
                Regisseur regisseur) {

        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        this.bewertung = bewertung;
        this.genre = genre;
        this.regisseur = regisseur;
    }

    public String getTitel() {
        return titel;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public double getBewertung() {
        return bewertung;
    }

    public Genre getGenre() {
        return genre;
    }

    public Regisseur getRegisseur() {
        return regisseur;
    }

    @Override
    public int compareTo(Film other) {
        return this.titel.compareTo(other.titel);
    }

    @Override
    public String toString() {
        return titel +
                " | Jahr: " + erscheinungsjahr +
                " | Bewertung: " + bewertung +
                " | Genre: " + genre +
                " | Regisseur: " + regisseur;
    }
}