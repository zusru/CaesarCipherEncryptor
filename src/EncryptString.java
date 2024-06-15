import java.util.Scanner;

public class EncryptString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter the key: ");
        int key = input.nextInt();

        String encryptedString = encryptString(str, key);
        System.out.println("Encrypted string: " + encryptedString);
    }

    public static String encryptString(String inputString, int aKey) {
        String outputString = "";
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            ch = (char) (ch + aKey);
            outputString += ch;
        }
        return outputString;
    }
}