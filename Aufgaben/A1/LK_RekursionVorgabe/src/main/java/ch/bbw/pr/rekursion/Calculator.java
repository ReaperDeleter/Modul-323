package ch.bbw.pr.rekursion;

/**
 * Calculator
 * @author Peter Rutschmann
 * @version 21.10.2023
 */
public class Calculator {
   void rekursivAufgabe1(int a, int b, int c){
      //TODO hier Aufgabe 1 rekursiv ergänzen
   }

   void loopAufgabe1(int a, int b, int c){
      //TODO hier Aufgabe 1 als loop ergänzen
   }

   //TODO freiwillig Aufgabe 2 implementieren


   //Daten für Aufgabe 3 und 4 NICHT ÄNDERN!!
   char[] chars = {'a', 'e', 'd', 's', 'r', 'n', 't', 'i', 'h', 'p', 'l', 'h', 'b', '.'};
   String[] code = {"001", "000", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

   //Aufgabe 3 als loop NICHT ÄNDERN!!
   public String aufgabe3Loop(char character) {
      StringBuilder retVal = new StringBuilder();
      for(int index=0; index< chars.length; index++) {
         if(chars[index] == character) {
            return code[index];
         }
      }
      return "not found";
   }

   public String aufgabe3Rekursiv(/*TODO hier ergänzen*/) {
      /*TODO hier gergänzen */
      return ""; //TODO return falls nötig anpassen
   }

   //Aufgabe 4 als loop NICHT ÄNDERN!!
   public String aufgabe4Loop(String text) {
      StringBuilder retVal = new StringBuilder();
      for (int i=0; i< text.length(); i++) {
         int j=0;
         for (; j<chars.length; j++){
            if(chars[j] == text.charAt(i)) break;
         }
         if(j<chars.length) retVal.append(code[j]+ " ");
         else retVal.append("--");
      }
      return retVal.toString();
   }

   public String aufgabe4rekursiv(/*TODO hier ergänzen*/) {
      /*TODO hier gergänzen */
      return ""; //TODO return falls nötig anpassen
   }
}
