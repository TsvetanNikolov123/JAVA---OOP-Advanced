05 Lab: Iterators and Comparators
=================================

---
---

Problems for exercises and homework for the ["Java OOP Advanced" course \@
SoftUni.](https://softuni.bg/courses/java-oop-advanced)

You can check your solutions here:
<https://judge.softuni.bg/Contests/523/Iterators-and-Comparators-Lab>

---

05.01 Book
----------

Create a class **Book** from **UML diagram** below:

<img src="https://user-images.githubusercontent.com/32310938/64905983-a0338b00-d6e8-11e9-89f9-0864902e0053.png" alt="alt text" width="300" height="">

You can use only **one constructor**. Authors can be **anonymous, one or many**.

### Examples

| Main.java                                                                                                                                                                                                                                                                                                                                                                                                             |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
        
        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree); 
    }

### Solution

<kbd><img src="https://user-images.githubusercontent.com/32310938/64905967-606ca380-d6e8-11e9-934c-595c869e49b2.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="01 Book" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/5%20ITERATORS%20AND%20COMPARATORS/p01_Book">01 Book</a>

---

05.02 Library
-------------

Create a class **Library** from **UML diagram** below:

<img src="https://user-images.githubusercontent.com/32310938/64906001-10421100-d6e9-11e9-8d66-bc3dcd0cc601.png" alt="alt text" width="250" height="">


Create a **nested class LibIterator** from **UML diagram** below:

<img src="https://user-images.githubusercontent.com/32310938/64906003-19cb7900-d6e9-11e9-95ae-ae4adc073787.png" alt="alt text" width="250" height="">


### Examples

| Main.java                                                                                                                                                                                                                                                                                                                                                                                                                                             |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
    
        Library library = new Library<>(bookOne, bookTwo, bookThree);
    
        for (Book book : library) {
            System.out.println(book.getTitle());
        }
    }

### Solution

<kbd><img src="https://user-images.githubusercontent.com/32310938/64905965-5f3b7680-d6e8-11e9-8c87-c5e23f4a7d3b.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="02 Library" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/5%20ITERATORS%20AND%20COMPARATORS/p02_Library">02 Library</a>

---

05.03 Comparable Book
---------------------

Expand Book by implementing **Comparable\<Book\>**

Book have to be **compared by name**. When name is equal, **compare** them by
**year.**

Expand **Book** from **UML diagram** below:

<img src="https://user-images.githubusercontent.com/32310938/64906032-7cbd1000-d6e9-11e9-842b-96cb4d4d924b.png" alt="alt text" width="250" height="">

You can use only **one constructor**. Authors can be **anonymous, one or many**.

### Examples

| Main.java                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
    
        if (bookOne.compareTo(bookTwo) > 0) {
            System.out.println(String.format("%s is before %s", bookOne, bookTwo));
        } else if (bookOne.compareTo(bookTwo) < 0) {
            System.out.println(String.format("%s is before %s", bookTwo, bookOne));
        } else {
            System.out.println("Book are equal");
        }
    }

<br/>

### Solution: <a title="03 Comparable Book" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/5%20ITERATORS%20AND%20COMPARATORS/p03_ComparableBook">03 Comparable Book</a>

---

05.04 Book Comparator
---------------------

Create a class **BookComparator** from **UML diagram** below:

<img src="https://user-images.githubusercontent.com/32310938/64906062-f654fe00-d6e9-11e9-85bc-1ae7cd7fca1a.png" alt="alt text" width="250" height="">

**BookComparator** have to **compare** two books by:

1.  Book title

2.  Year of publishing a book

### Examples

| Main.java                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
    
        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
    
        books.sort(new BookComparator());
    
        for (Book book : books) {
            System.out.println(book.getTitle() + book.getYear());
        }
    }

<br/>

### Solution: <a title="04 Book Comparator" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/5%20ITERATORS%20AND%20COMPARATORS/p04_BookComparator">04 Book Comparator</a>

---                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
