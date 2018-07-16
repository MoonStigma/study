package home.lr3.task2;

public class CreateSentence {
    public static final String SEPARATOR = " ";

    public static void main(String[] args) {
        String s = "Git Hub";
        String[] arrayStings = s.split(SEPARATOR);
        StringBuilder sb = new StringBuilder();
        // System.out.println(turnOver("GitHub"));
        for (int i = 0; i <= arrayStings.length-1; i++) {

            sb.append(turnOver(arrayStings[i]));
            sb.append(SEPARATOR);
        }
        System.out.println(sb.toString().trim());
    }

    private static String turnOver(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }

}
