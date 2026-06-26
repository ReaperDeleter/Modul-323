import java.util.Scanner;

public class PalindromTest {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Bitte geben Sie einen Text ein:");
        String userInput = keyboard.nextLine();

        if (isPalindrom(userInput.toCharArray(), 0, userInput.length() - 1)) {
            System.out.println("Die Eingabe ist ein Palindrom");
        } else {
            System.out.println("Die Eingabe ist kein Palindrom");
        }

        keyboard.close();
    }

    private static boolean isPalindrom(char[] data, int front, int rear) {

        if (front >= rear) {
            return true;
        }

        if (data[front] != data[rear]) {
            return false;
        }

        return isPalindrom(data, front + 1, rear - 1);
    }
}