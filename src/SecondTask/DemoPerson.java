package SecondTask;

import java.util.*;

public class DemoPerson {
    public static void main(String[] args) {
        List<Person> firstSet = new ArrayList<>();
        firstSet.add(new Person("Maria", 34));
        firstSet.add(new Person("Ivan", 25));
        firstSet.add(new Person("Petr", 56));
        firstSet.add(new Person("Ivan", 25));
        firstSet.add(new Person("Petr", 43));
        firstSet.add(new Person("Anna", 19));

        List<Person> secondSet = new ArrayList<>();
        secondSet.add(new Person("Svetlana", 9));
        secondSet.add(new Person("Anna", 19));
        secondSet.add(new Person("Ivan", 25));

        firstSet.sort(Person::compareTo);
        Collections.sort(secondSet, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });

        System.out.println(Person.isEqual(firstSet, secondSet));
        System.out.println("Sorted FirstSet:");
        for (Person value : firstSet) {
            value.print();
        }
        System.out.println("Sorted SecondSet:");
        for (Person value : secondSet) {
            value.print();
        }
        System.out.println("distinct SecondSet:");
        for (Person person : Person.distinct(firstSet)) {
            person.print();
        }
    }
}
