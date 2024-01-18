import java.util.Scanner;

public class FreqOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character: ");
        char targetChar = scanner.next().charAt(0);

        int frequency = getCharacterFrequency(inputString, targetChar);
        System.out.println("Frequency of '" + targetChar + "': " + frequency);

    }

    private static int getCharacterFrequency(String input, char targetChar) {
        int frequency = 0;
        for (char ch : input.toCharArray()) {
            if (ch == targetChar) {
                frequency++;
            }
        }
        return frequency;
    }
}
