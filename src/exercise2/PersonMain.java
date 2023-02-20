package exercise2;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ioan", 54, "black"));
        persons.add(new Person("Vasile", 67, "black"));
        persons.add(new Person("Maria", 44, "blonde"));
        persons.add(new Person("Andrei", 32, "brown"));
        persons.add(new Person("Stefan", 32, "bold"));

        System.out.println("2.1 List of person names: \n" + PersonService.getPersonNames(persons));
        System.out.println("2.2 Map of person's name to their age: \n" + PersonService.mapPersonsNameToAge(persons));
        System.out.println("2.3 Persons older than 50 are: \n" + PersonService.getPersonOlderThan(persons, 50));
        System.out.println("2.4 Map of person's hair colour to their name: \n" + PersonService.mapHairColourWithName(persons));
        System.out.println("2.5 Map from age to Persons: \n" + PersonService.mapAgeToPersons(persons));
    }
}
