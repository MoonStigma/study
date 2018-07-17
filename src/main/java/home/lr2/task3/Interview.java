package home.lr2.task3;

import java.util.Scanner;


public class Interview {

    //public static final int STEP = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int workers = sc.nextInt();
        System.out.println(calculateInterview(workers));
    }

    public static int calculateInterview(int workers) {
        int inter = workers - 1;
        workers --;
        if (workers > 1) {
            inter += calculateInterview(workers);
        }
        return inter;
    }
}
