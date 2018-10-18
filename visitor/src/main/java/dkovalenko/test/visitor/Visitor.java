package dkovalenko.test.visitor;

public interface Visitor {

    void visitJustPerson(JustPerson justPerson);

    void visitMiddlePerson(OfficePerson officePerson);

    void visitMainPerson(MainPerson mainPerson);

}
