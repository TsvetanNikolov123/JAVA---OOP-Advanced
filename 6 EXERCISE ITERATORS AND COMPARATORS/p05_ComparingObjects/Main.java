package p05_ComparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> peoples = new ArrayList<>();

        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }

            String[] tokens = line.split("\\s+");

            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            peoples.add(person);
        }

        int n = Integer.parseInt(reader.readLine());

        if (n < 0 || n >= peoples.size()) {
            System.out.println("No matches");
            return;
        }

        Person person = peoples.get(n);

        long countOfEqualPeople = peoples.stream().filter(person1 -> person1.compareTo(person) == 0).count();

        if (countOfEqualPeople == 0) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d%n",
                    countOfEqualPeople,
                    peoples.size() - countOfEqualPeople,
                    peoples.size());
        }
    }
}
