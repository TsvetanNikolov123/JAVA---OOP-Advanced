package p01_Weekdays;

public class Main {
    public static void main(String[] args) {
        WeeklyCalendar wc = new WeeklyCalendar();

        wc.addEntry("Friday", "sleep");
        wc.addEntry("monday", "sport");

        Iterable<WeeklyEntry> shedule = wc.getWeeklySchedule();

        for (WeeklyEntry weeklyEntry : shedule) {
            System.out.println(weeklyEntry);
        }
    }
}
