package p05_ComparingObjects;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person other) {

        /*compare by names*/
        int comparatorByName = this.name.compareTo(other.name);
        if (comparatorByName != 0) {
            return comparatorByName;
        }

        /*compare by ages*/
        int comparatorByAge = this.age - other.age;
        if (comparatorByAge != 0) {
            return comparatorByAge;
        }

        /*compare by towns*/
        return this.town.compareTo(other.town);
    }
}
