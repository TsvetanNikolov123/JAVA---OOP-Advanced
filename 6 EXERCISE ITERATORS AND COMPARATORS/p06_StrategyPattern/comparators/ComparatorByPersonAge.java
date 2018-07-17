package p06_StrategyPattern.comparators;

import p06_StrategyPattern.Person;

import java.util.Comparator;

public class ComparatorByPersonAge implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return person1.getAge() - person2.getAge();
    }
}
