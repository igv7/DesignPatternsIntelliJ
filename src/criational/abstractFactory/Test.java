package criational.abstractFactory;

public class Test {
    public static void main(String[] args) {
        FormatFactory factory106 = new Java106Factory();
        factory106.getAdmin().admin();
        factory106.getTeacher().teach();

        FormatFactory factory110 = new Java110Factory();
        factory110.getAdmin().admin();
        factory110.getTeacher().teach();
    }
}
