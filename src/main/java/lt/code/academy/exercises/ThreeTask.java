package lt.code.academy.exercises;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ThreeTask {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int sum = 0;
        System.out.println("Iveskite i masyva skaicius. 0 sustabdo operacija:");
        while (true) {
            int value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            array[index] = value;
            index++;
        }
        scanner.close();
        System.out.println("Ivesti skaiciai yra");
        for (int i = 0; i < index; i++) {
            System.out.println(array[i]);
        }
            System.out.println("***************************");
            for (int i = 0; i <= index; i++) {
                sum += array[i];
            System.out.println(sum);
        }
    }
}
