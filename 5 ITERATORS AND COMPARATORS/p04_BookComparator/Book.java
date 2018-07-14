package p04_BookComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    private void setAuthors(String... authors) {
        if (authors.length == 0) {
            this.authors = new ArrayList<String>();
        } else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    @Override
    public int compareTo(Book o) {
        if (this.getTitle().compareTo(o.getTitle()) == 0) {
            // we can`t use compareTo with years because years are primitive type and there is no compareTo
            // compare years ->  we have 2 choices
            // first is this ...
            return this.getYear() - o.getYear();
            // second one is this....
            // return Integer.compare(this.getYear(), o.getYear());
        }

        return this.getTitle().compareTo(o.getTitle());
    }


    @Override
    public String toString() {
        return this.getTitle() + " - " + this.getYear();
    }
}
