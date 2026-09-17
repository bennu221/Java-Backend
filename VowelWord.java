import java.util.Scanner;

public class VowelWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        int vowels = 0;
        int words = 1;

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;

            if (str.charAt(i) == ' ')
                words++;
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Words = " + words);
    }
}