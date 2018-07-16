package home.lr3.task3;

import java.util.Random;

public class RandomMass {
    public static void main(String[] args) {
        int massLength = 20;
        int[] randomMass = generateArray(massLength);
        String s = sortArray(randomMass);
        printArray(randomMass);
        System.out.println(s);
    }

    private static int[] generateArray(int massLength) {
        int[] randomMass = new int[massLength];

        for (int i = 0; i <= massLength - 1; i++) {
            randomMass[i] = (int) (Math.random() * 90 + 10);
        }
        return randomMass;
    }

    private static String sortArray(int[] inputArray) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= inputArray.length - 1; i++) {
            if (inputArray[i] % 3 == 0) {
                result.append(inputArray[i]);
                result.append(" ");
            }
        }
        return result.toString();
    }

    private static void printArray(int[] array){
        for ( int i = 0; i<= array.length - 1; i++){
            System.out.println(array[i]);
        }
    }
}
