package criational.abstractFactory;

public class Java106Factory extends FormatFactory {
    @Override
    public Admin getAdmin() {
        return new Java106Admin();
    }

    @Override
    public Teacher getTeacher() {
        return new Java106Teacher();
    }
}
