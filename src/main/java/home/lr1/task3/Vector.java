package home.lr1.task3;
import java.util.Scanner;
import java.lang.Math;

public class Vector {

    public static void main(String[] args) {

        Scanner price = new Scanner(System.in);
        System.out.println("Введите x ");
        double x = price.nextDouble();
        System.out.println("Введите y ");
        double y = price.nextDouble();
        System.out.println("Введите z ");
        double z = price.nextDouble();

       getVector( x, y, z );

    }

    public static void getVector(double x, double y, double z){
        double length = Math.sqrt( x*x + y*y + z*z );
        System.out.println("Vector's lenght = " + "( " + x/length + " , " +
         y/length + " , " + z/length + ")");
    }
}
