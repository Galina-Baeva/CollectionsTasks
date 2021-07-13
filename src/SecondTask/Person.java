package SecondTask;

import java.util.*;

public class Person implements Comparable {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareAge(Person person) {
        return getAge() - person.getAge();
    }

    public int comparePerson(Person person) {
        int i = getName().compareTo(person.getName());
        if (i == 0) {
            return compareAge(person);
        }
        return i;
    }

    public static List<Person> distinct(List<Person> people) {
        for (int i = 0; i < people.size() - 1; i++)
            for (int j = i+1; j < people.size(); j++) {
                if (people.get(i).comparePerson(people.get(j)) == 0 && i != j) {
                    people.remove(j);
                }
            }
        return people;
    }

    public static boolean isEqual(List<Person> firstSet, List<Person> secondSet) {
        if (firstSet.size() != secondSet.size()) {
            return false;
        }
        Iterator<Person> iter = firstSet.iterator();
        Iterator<Person> iter2 = secondSet.iterator();
        while (iter.hasNext() && iter2.hasNext()) {
            int result = iter.next().comparePerson(iter2.next());
            if (result != 0) {
                return false;
            }
        }
        return true;
    }

    public void print() {
        System.out.println(name + " " + age + " years old");
    }

    @Override
    public int compareTo(Object o) {
        //if ()
        return 0;
    }
}
