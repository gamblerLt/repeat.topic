package lt.code.academy.exercises;

import java.util.Scanner;

public class NineTask {
    public static void main(String[] args) {
        //int x;
        int sum;
        int sumMin;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int x = scanner.nextInt();

        if (x > 0) {
            sum = 2 * x + 8;
            System.out.println(sum);

        }else
        {
            sumMin = 21 - 7 * x;
            System.out.println(sumMin);
        }
    }
}
/*9. Parašyti programą funkcijos f(x) reikšmei surasti:
a. jei x teigiamas, tai f(x)=2x+8,
b. jei x neteigiamas, tai f(x)=21-7x*/
