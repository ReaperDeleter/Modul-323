package ch.bbw.pr.rekursion;

/**
 * Calculator
 * @author Louis Schulle
 * @version 27.03.2026
 */
public class Calculator {
   void rekursivAufgabe1(int a, int b, int c){
      if(a < c){
         System.out.print(a*b + " ");
         rekursivAufgabe1(a+1, b+2, c);
      }
   }

   void loopAufgabe1(int a, int b, int c){
      while(a < c){
         System.out.print(a*b + " ");
         a++;
         b += 2;
      }
   }

   //TODO freiwillig Aufgabe 2 implementieren
int aufgabe2(int a, int b){
      if(a == 0 || b == 0) {
         return 0;
      } else if (a % 2 == 0) {
         return aufgabe2 (a / 2, b * 2);
      }

      return b + aufgabe2((a - 1) / 2, b * 2);
   }

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

   public String aufgabe3Rekursiv(char character, int index) {
      if (index >= chars.length) {
         return "not found";
      }
      if (chars[index] == character) {
         return code[index];
      }
      return aufgabe3Rekursiv(character, index + 1);
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

   //Aufgabe 4 als rekursive Lösung (keine Schleife, zweifache Rekursion)
   public String aufgabe4rekursiv(String text, int textIndex) {
      if (textIndex >= text.length()) {
         return "";
      }
      char current = text.charAt(textIndex);
      String codeForChar = findCodeForChar(current, 0);
      String item = codeForChar.equals("not found") ? "--" : codeForChar;
      String suffix = (textIndex < text.length() - 1) ? " " : "";
      return item + suffix + aufgabe4rekursiv(text, textIndex + 1);
   }

   private String findCodeForChar(char character, int charIndex) {
      if(charIndex >= chars.length) {
         return "not found";
      }
      if(chars[charIndex] == character) {
         return code[charIndex];
      }
      return findCodeForChar(character, charIndex + 1);
   }
}
