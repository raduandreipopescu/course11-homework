package exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonUtil {
    public static List<String> getPersonNames(List<Person> persons) {
        List<String> results = new ArrayList<>();
        for (Person person : persons) {
            results.add(person.name());
        }
        return results;
    }

    public static Map<String, Integer> mapPersonsNameToAge(List<Person> persons) {
        Map<String, Integer> results = new HashMap<>();
        for (Person person : persons) {
            results.put(person.name(), person.age());
        }
        return results;
    }

    public static List<Person> getPersonOlderThan(List<Person> persons, int ageLimit) {
        List<Person> results = new ArrayList<>();
        for (Person person : persons) {
            if (person.age() > ageLimit) {
                results.add(person);
            }
        }
        return results;
    }

    public static Map<String, List<String>> mapHairColourWithName(List<Person> persons) {
        Map<String, List<String>> results = new HashMap<>();
        for (Person person : persons) {
            if (results.containsKey(person.hairColour())) {
                results.get(person.hairColour()).add(person.name());
            } else {
                List<String> values = new ArrayList<>();
                values.add(person.name());
                results.put(person.hairColour(), values);
            }
        }
        return results;
    }

    public static Map<Integer, List<Person>> mapAgeToPersons(List<Person> persons) {
        Map<Integer, List<Person>> results = new HashMap<>();
        for (Person person : persons) {
            if (results.containsKey(person.age())) {
                results.get(person.age()).add(person);
            } else {
                List<Person> values = new ArrayList<>();
                values.add(person);
                results.put(person.age(), values);
            }
        }
        return results;
    }
}