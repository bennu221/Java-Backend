public class FirstNonRepeating {
    public static void main(String[] args) {

        String str = "programming";
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i) - 'a'] == 1) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                break;
            }
        }
    }
}