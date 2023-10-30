import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input.toLowerCase());

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        boolean[] mark = new boolean[26];
        int index;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);

            if ('a' <= ch && ch <= 'z') {
                index = ch - 'a';
                mark[index] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                return false;
            }
        }

        return true;
    }
}
