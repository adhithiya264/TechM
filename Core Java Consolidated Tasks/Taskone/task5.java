public class CapitalizeAlternateCharacters {
    public static void main(String[] args) {
        String input = "anurag";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (i % 2 == 0) {
                output.append(Character.toUpperCase(ch));
            } else {
                output.append(Character.toLowerCase(ch));
            }
        }

        System.out.println("Original String: " + input);
        System.out.println("String with alternate characters capitalized: " + output.toString());
    }
}
