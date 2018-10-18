package dkovalenko.test.visitor;

public class MainPerson implements Person {

    private String name;

    public MainPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visitMainPerson(this);
    }
}
