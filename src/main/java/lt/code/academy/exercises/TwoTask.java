package lt.code.academy.exercises;

import java.util.Scanner;

public class TwoTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek ivesite skaiciu?");
        int userInput = scanner.nextInt();

        int[] array = new int[userInput];
        System.out.println("Iveskite " + userInput + " skaicius");
        for (int i = 0; i < userInput; i++) {
            array[i] = scanner.nextInt();

        }

        System.out.println("I masyva ivedete sius skaicius:");

        for (int i = 0; i < userInput; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("\n********");
        System.out.println("I masyva ivedete siuos skaicius kurie mazesni uz 100:");

        for (int i = 0; i < userInput; i++) {
            if (array[i] < 100)
                System.out.print(array[i] + ", ");
        }

       System.out.println("I masyva ivedete siuos skaicius kurie didesni uz 100:\n");

        for (int i = 0; i < userInput; i++) {
            if (array[i] > 100)
                System.out.println(array[i] + ", ");

        }

    }

}

