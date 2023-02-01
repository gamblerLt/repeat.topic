package lt.code.academy.paveldejimas;

public abstract class MyAbstractClass {

    public abstract String generateKey(String id);

    public void myMethod() {
        System.out.println(generateKey("558999"));
    }

}
