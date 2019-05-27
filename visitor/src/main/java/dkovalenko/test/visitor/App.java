package dkovalenko.test.visitor;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Visitor visitorSiren = new VisitorSiren();
        List<Person> people = Arrays.asList(new JustPerson(),
                new MainPerson("Президент"),
                new OfficePerson(),
                new JustPerson(),
                new JustPerson(),
                new MainPerson("Олигарх"),
                new OfficePerson());

        for (Person person : people) {
            person.accept(visitorSiren);
        }
    }

    private static class VisitorSiren implements Visitor {

        public void visitJustPerson(JustPerson person) {
            System.out.println("Эй, халоп, выходи, тревога.");
        }

        public void visitMiddlePerson(OfficePerson person) {
            System.out.println("Пройдите, пожалуйста, к выходу, тревога.");
        }

        public void visitMainPerson(MainPerson person) {
            System.out.println("Господин " + person.getName() + ", давайте мы поможем вам эвакуироваться");
        }
    }

}
