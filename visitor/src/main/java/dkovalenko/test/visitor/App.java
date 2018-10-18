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
        public void visitJustPerson(JustPerson justPerson) {
            System.out.println("Обычный человек услышал: Уииииуууииииуууиииииу.");
        }

        public void visitMiddlePerson(OfficePerson middlePerson) {
            System.out.println("Оффисный человек услышал: Тревога, пройдите пожалуйста к выходу.");
        }

        public void visitMainPerson(MainPerson mainPerson) {
            System.out.println("Супер главнй человек услышал: Господин " + mainPerson.getName() + ", вам пора спуститься в бункер.");
        }
    }

}
