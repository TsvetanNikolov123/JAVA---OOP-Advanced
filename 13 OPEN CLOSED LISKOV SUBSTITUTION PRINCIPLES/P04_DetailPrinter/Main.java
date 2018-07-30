package P04_DetailPrinter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        final Employee emp = new Employee("emp");
        final Developer dev = new Developer("dev", "project");
        final Manager manager = new Manager("manager", new ArrayList<String>(){{
            add("doc1");
            add("doc2");
            add("doc3");
        }});

        DetailsPrinter dp = new DetailsPrinter(new ArrayList<Employee>(){{
            add(emp);
            add(dev);
            add(manager);
        }});

        dp.printDetails();
    }
}
