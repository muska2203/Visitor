package dkovalenko.test.visitor;

public interface Visitor {

    void visitJustPerson(JustPerson person);

    void visitMiddlePerson(OfficePerson person);

    void visitMainPerson(MainPerson person);

}
