package lt.code.academy.exercises;

import java.util.Scanner;

public class FourTask {

    public static void main(String[] args) {

        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Ivesk 5 skaicius");
        for(int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println(sum);

    }
}

/*
* Parašyti programą, kuri paprašytų įvesti 5 skaičius. Baigus skaičių įvedimą, turi būti
atvaizduojama įvestų skaičių suma ir visi įvesti skaičiai
* */
/*public class Sum {

public static int sumArray (int[] array) {
    int sum = 0;
    for (int i : array) {
        sum += i;
    }
    return sum;
}

public static void main(String[] args) {
    int[] myArray = {1,2,3,4,5};
    int result = Sum.sumArray(myArray);
    System.out.println(result);
}

}

public class Subtract {

public static int subArray (int[] array) {
    int sub = 0;
    for (int i : array) {
        sub -= i;
    }
    return sub;
}

public static void main(String[] args) {
    int[] myArray = {1,2,3,4,5};
    int result = Subtract.subArray(myArray);
    System.out.println(result);
}

}*/