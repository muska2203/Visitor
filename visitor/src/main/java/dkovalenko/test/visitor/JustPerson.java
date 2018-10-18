package dkovalenko.test.visitor;

public class JustPerson implements Person{

    public void accept(Visitor visitor) {
        visitor.visitJustPerson(this);
    }
}
