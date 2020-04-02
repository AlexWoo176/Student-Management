package exercise.alexwoo;

import java.util.Iterator;
import java.util.LinkedList;

public class PersonTest {
    LinkedList<Person> listPerson = new LinkedList<Person>();

    public void inputData(String name, boolean isMan, String dateOfBirth, String address) {
        Person person = new Person(name, isMan, dateOfBirth, address);
        listPerson.add(person);
    }

    public void displayPerson() {
        Iterator<Person> iterator = listPerson.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
