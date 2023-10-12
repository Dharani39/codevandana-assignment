public class PangramChecker {
    public static void main(String args[]){
        String input = "The quick brown fox jumps over the lazy dog";

        boolean isPangram = isPangram(input);
        System.out.println(isPangram);

    }

    public static boolean isPangram(String input) {

        input = input.toLowerCase();
        boolean[] alphabet = new boolean[26];
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    count++;
                }
            }
        }

        return count == 26;
    }}

