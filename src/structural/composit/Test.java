package structural.composit;

public class Test {
    public static void main(String[] args) {
        Forum forum = new Forum();
        forum.addMember(new Person("Moshe"));
        forum.addMember(new Person("Kobi"));
        forum.addMember(new Person("Igor"));
//        forum.introduceYourself();

        Forum subForum = new Forum();
        subForum.addMember(new Person("Matan"));
        subForum.addMember(new Person("Zamir"));

        forum.addMember(subForum);
        forum.introduceYourself();
    }
}
