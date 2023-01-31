package lt.code.academy.method;

public class Main {
    public static void main(String[] args) {

        Second second = new Second();
        second.setId(10);
        //konstruktorius nieko negrazina, tokio pat vardo kaip klase,
        // visos klases turi konstruktorius net jeigu jis ir neparasyta

        System.out.println("As esu mainas");
        System.out.println(second.getId());

        Main main = new Main();//nes statinis negali iskviesti nestatinio
        main.printMethod(second);

        System.out.println(second.getId());

        int a = 5;
        main.secondMethod(a);
        System.out.println(a);


        int v = 66;
        main.thirdMethod(v);
        System.out.println(v);

    }

    private void printMethod(Second second) {//cia objektas keiciamas atmintyje
        System.out.println(second);
        second.setId(20);

    }

    private void secondMethod(int a) { //kadangi nieko negrazina, tai nieko ir nepakeicia
        System.out.println(a);
        a = 25;
    }

    private int thirdMethod(int v) {
        System.out.println(v);
        v = 2545;
        System.out.println(v);

        return v;
    }
}