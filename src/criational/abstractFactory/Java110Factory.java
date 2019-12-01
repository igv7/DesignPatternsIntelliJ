package criational.abstractFactory;

public class Java110Factory extends FormatFactory {
    @Override
    public Admin getAdmin() {
        return new Java110Admin();
    }

    @Override
    public Teacher getTeacher() {
        return new Java110Teacher();
    }
}
