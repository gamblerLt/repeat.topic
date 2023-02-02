package lt.code.academy.exercises;

import java.util.Scanner;

public class FiveTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];

        System.out.println("Iveskite 5 zodzius");

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();

        }
        for(String word : array) {
            System.out.println(word);
        }

    }
}

/*Parašyti programą kuri paprašytų vartotojo įvesti 5 žodžius. Po to kai bus įvesti visi
žodžiai, jie turi būti atvaizduojami.*/
