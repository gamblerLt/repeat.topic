package lt.code.academy.modprivate;

public class B extends C{
    public void firstBMethod () {
        A a = new A();
      // C c = new C();
       // c.firstCMethod();
        a.firstAMethod();
        a.secondAMethod();
       //a.thirdAMethod();
        System.out.println();
        firstCMethod(); // nes extends
    }
}
