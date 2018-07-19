package p01_Weekdays;

import java.util.Comparator;

public class WeeklyEntry {

    public static final Comparator<WeeklyEntry> WEEKLY_ENTRY_COMPARATOR = getComparator();

    private Weekday day;
    private String notes;

    public WeeklyEntry(String day, String notes) {
        // with this we take String and put it to enums or something like this
        this.day = Enum.valueOf(Weekday.class, day.toUpperCase());
        this.notes = notes;
    }

    private static Comparator<WeeklyEntry> getComparator() {
        // return (e1, e2) -> e1.day.compareTo(e2.day);

        return (e1, e2) -> Integer.compare(e1.day.ordinal(), e2.day.ordinal());
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.day, this.notes);
    }
}
