package lt.code.academy.check;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a < b) {
            System.out.println("Taip");
        }

        if(a < b && b > 50) {
            System.out.println("&& tenkina 1 ir 2 salyga");
        }else{
            System.out.println("kazkuri salyga netenkina");

            /*
             * true && true = true
             * true && false = false
             * false && true = false
             *
             * true || true = true
             * true || false = true
             * false || true = true
             * false || false = false
             * */
        }

        switch (a) {//geriau case nei if elsus
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            default -> System.out.println("no number");
        }
    }
}

