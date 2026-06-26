import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Bitte geben Sie einen Text ein:");
        String text = keyboard.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println(reversed);

        keyboard.close();
    }
}