package home.lr1;
import java.util.Scanner;

public class NumberSeparate {

    public static void main(String[] args) {
        Scanner price = new Scanner(System.in);
        System.out.println("Введите число ");
        int x = price.nextInt();

        printNumber(x);
    }

    public static void printNumber(int x){
        System.out.println(x / 10000);
        x %= 10000;
        System.out.println(x / 1000);
        x %= 1000;
        System.out.println(x / 100);
        x %= 100;
        System.out.println(x / 10);
        x %= 10;
        System.out.println(x);
    }
}
