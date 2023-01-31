package lt.code.academy.method;

public class Second extends First{
    private int id;
    public Second() {
       this(100500800);//sitas ateina is dddddd
    }
    public Second(int a) { // cia yra ddddddd
        super("Verte kazkokia ateinu is first");//pasiima tikra tevo rezultata
        System.out.println(a);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
