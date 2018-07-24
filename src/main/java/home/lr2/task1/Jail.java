package home.lr2.task1;

import java.util.Scanner;

public class Jail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gap = sc.nextInt();

        for (int i = 0; i < 4; i++) {
            printBones(gap / 3);
            for (int j = 0; j < gap / 3; j++) {
                printSpace(gap / 3);
            }
        }
        printBones(gap / 3);
    }

    public static void printSpace(int space) {

        for (int i = 0; i < 4; i++) {
            System.out.print("*");
            for (int j = 0; j < space; j++)
                System.out.print("   ");
        }
        System.out.printf("*%n");
    }

    public static void printBones(int bones) {

        for (int i = 0; i < 4; i++) {
            System.out.print("*");
            for (int j = 0; j < bones; j++)
                System.out.printf("***");
        }
        System.out.printf("*%n");

    }

}
