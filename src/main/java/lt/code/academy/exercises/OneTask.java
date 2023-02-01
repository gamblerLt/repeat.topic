package lt.code.academy.exercises;

import java.util.Scanner;

public class OneTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int userNumber = scanner.nextInt();

        if (userNumber %2 == 0) {

            //num % 2 == 0
            System.out.println("Lyginis");

        }else{
            System.out.println("Nelyginis");
        }
    }
}
