package lt.code.academy.modprivate;

public class A {
    void firstAMethod() {
        System.out.println("First A met");
        thirdAMethod();
    }

    public void secondAMethod() {
        System.out.println("2");
        thirdAMethod();

    }

    private  void thirdAMethod() {
        System.out.println("3");
    }

}
