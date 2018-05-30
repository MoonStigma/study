package home.lr2;

import java.util.Scanner;

public class NumberCount {
    private final static int HARD_DECIMAL = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputDigit = sc.nextInt();
        System.out.println(new NumberCount().calculateNumber(inputDigit));
    }

    private int calculateNumber(int number) {
        int less = number % HARD_DECIMAL;
        number /= HARD_DECIMAL;
        if (number != 0) {
            less += calculateNumber(number);
        }
        return less;
    }
}
