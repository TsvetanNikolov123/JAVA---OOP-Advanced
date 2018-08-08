package p04_work_force.abstractClasses;

public abstract class Employee implements p04_work_force.interfaces.Employee {
    private String name;
    private int workHoursPerWeek;

    public Employee(String name, int workHoursPerWeek) {
        this.name = name;
        this.workHoursPerWeek = workHoursPerWeek;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWorkHoursPerWeek() {
        return this.workHoursPerWeek;
    }
}
