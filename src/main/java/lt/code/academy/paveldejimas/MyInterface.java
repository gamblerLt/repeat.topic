package lt.code.academy.paveldejimas;

public interface MyInterface extends MySecondInterface{
    void testMethod();
    default void myDefaultMethod() {
        System.out.println("My default interface");
    }
}
