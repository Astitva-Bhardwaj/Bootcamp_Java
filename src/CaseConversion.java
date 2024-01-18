public class CaseConversion {
    public static void main(String[] args) {
        String originalString = "Hello, World";

        String uppercaseString = convertToUppercase(originalString);
        String lowercaseString = convertToLowercase(originalString);

        System.out.println("Uppercase: " + uppercaseString);
        System.out.println("Lowercase: " + lowercaseString);
    }

    private static String convertToUppercase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        return new String(chars);
    }

    private static String convertToLowercase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new String(chars);
    }
}
