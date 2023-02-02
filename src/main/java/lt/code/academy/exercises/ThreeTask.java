package lt.code.academy.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreeTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skacius (0 daro abrakadabra): ");
        int number = scanner.nextInt();

        int[] array = new int[10];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();

            System.out.println(array[i] + ", ");

        }




        /*
        int[] array = new int[userInput];
        System.out.println("Iveskite " + userInput + " skaicius");
        for (int i = 0; i < userInput; i++) {
            array[i] = scanner.nextInt();

        }

        System.out.println("I masyva ivedete sius skaicius:");

        for (int i = 0; i < userInput; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("\n********");*/

    }

    public class sum {


    }


}
/*
1. scaner
2. aray
3. if = 0
4. naujas skai2iavimo sum array metodas
5. Vartotojas gali ivesti tik int

Parašyti programą, kuri paprašytų įvesti skaičius tol, kol bus įvestas skaičius 0. Pabaigoje
turi būti atvaizduojama įvestų skaičių suma. Skaičiavimas turi būti atliekamas kitame metode.
Papildykite programą kuri neleistų įvesti ne skaičius, jei vartotojas įveda ne skaičių programa
prašo pakartoti tol kol bus įvestas skaičius.*/
