package lt.code.academy.exercises;

public class SixTask {
    public static void main(String[] args) {


        int[] oneArray = {1, 2, 3};
        String[] twoArray = {"a", "b", "c"};

        for (int i = 0; i < oneArray.length; i++) {
            System.out.println(oneArray[i] + twoArray[i]+"");


        }
    }
}
/*Parašykite metodą kuris per parametrus paimtu du masyvus [1,2,3,4] ir [a,b,c,d] ir kaip
rezultatą grąžintu [1,a,2,b,3,c,4,d] kaip rezultatą*/