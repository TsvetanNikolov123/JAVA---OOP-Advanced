package p04_work_force.interfaces;

public interface Job  {
    String getName();

    int getHoursPerWeekRequired();

    Employee getEmployee();

    void update();
}
