package ch.bbw.pr.rekursion;

/**
 * Main Lernkontrolle Rekursion
 * @author Peter Rutschmann
 * @version 21.10.2023
 */
public class Main {
   public static void main(String[] args) {
      Calculator calculator = new Calculator();
      System.out.println("Aufgabe 1 rekursiv:");
      calculator.rekursivAufgabe1(1,2,7);
      System.out.println("Aufgabe 1 while-loop:");
      calculator.loopAufgabe1(1,2,7);
      System.out.println();

      System.out.println("Aufgabe 2 rekursiv:");
      System.out.println("Siehe Blatt!! ");
      System.out.println();

      System.out.println("Aufgabe 3:");
      char c = 's';
      System.out.println("loop: " + c + " = " + calculator.aufgabe3Loop(c));
      System.out.println("rekursiv: " + c + " = " + calculator.aufgabe3Rekursiv(/* TODO hier ergänzen */));
      System.out.println();

      System.out.println("Aufgabe 4:");
      String text = "alphabet";
      System.out.println("loop: " + text + " = " + calculator.aufgabe4Loop(text));
      System.out.println("rekursiv: " + text + " = " + calculator.aufgabe4rekursiv(/* TODO hier ergänzen */));
      System.out.println();
   }
}