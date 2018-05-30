package home.lr1;

import java.util.Scanner;

public class TypeOutput {

    public static void main(String[] args) {


        Scanner price = new Scanner(System.in);
        System.out.println("Введите x ");
        int x = price.nextInt();
        System.out.println("Введите y ");
        int y = price.nextInt();
        System.out.println("Введите z ");
        int z = price.nextInt();
        System.out.println("Введите n ");
        int n = price.nextInt();

        System.out.println("Результаты:");
        System.out.println("Int: " + getIntResult(x,y,z,n));
        System.out.println("Long: " + getLongResult(x,y,z,n));
        System.out.println("Double: " + getDoubleResult(x,y,z,n));
        System.out.println("Float: " + getFloatResult(x,y,z,n));
    }

    private static int getIntResult(int x, int y, int z, int n) {
        int summ = (x + ( 50 - y * z ) / n) - x;
        return summ;
    }

    private static long getLongResult(long x, long y, long z, long n) {
        long summ = x - (y + 123) / z * n;
        return summ;
    }

    private static double getDoubleResult(double x, double y, double z, double n) {
        double summ = (-x / -y) + z / (n + 15);
        return summ;
    }

    private static float getFloatResult(float x, float y, float z, float n) {
        float summ = x / (y * ( z - 1) - 564) + n;
        return summ;
    }

}