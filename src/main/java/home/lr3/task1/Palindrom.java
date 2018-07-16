package home.lr3.task1;

public class Palindrom {

    public static void main(String[] args) {
        String palindrom = "аргентинаманитнегра";
        System.out.println(isPalindrom(palindrom));

    }

    private static boolean isPalindrom(String palindrom) {
        int palindromLength = palindrom.length();

        for (int i=0; i<=palindromLength/2; i++){

            if (palindrom.charAt(i) != palindrom.charAt(palindromLength-i-1)){
                return false;

          }

        }
        return true;
    }
}
