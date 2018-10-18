package dkovalenko.test.visitor;

public class OfficePerson implements Person {

    public void accept(Visitor visitor) {
        visitor.visitMiddlePerson(this);
    }
}
