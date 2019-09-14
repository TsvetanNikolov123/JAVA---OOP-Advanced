07 Lab: Enumerations and Annotations
====================================

---
---

Problems for exercises and homework for the ["Java OOP Advanced" course \@
SoftUni](https://softuni.bg/courses/java-oop-advanced).

You can check your solutions here:
<https://judge.softuni.bg/Contests/524/Enumerations-and-Annotations-Lab> .

---

Part I: Enumerations
--------------------

07.01 Weekdays
--------------

Create **Enum** Weekday with the days from **Monday** through **Sunday**.
Override **toString()**, which should return weekdays with a capital first
letter, in format **"Monday"**, **"Tuesday"**, etc.

Create a class **WeeklyCalendar** that should have at least the methods:

-   void addEntry(String weekday, String notes)

-   Iterable\<WeeklyEntry\> getWeeklySchedule() - returns weekly entries sorted
    by day in ascending order

Create a class **WeeklyEntry** which should have constructor:

-   WeeklyEntry(String weekday, String notes)

Override **toString()** of **WeeklyEntry** – "{**weekday**} - {**notes**}" (e.g.
"Monday - sport", "Sunday - sleep")

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64907211-24d9d580-d6f8-11e9-9a93-70d6bb552f21.png" alt="alt text" width="700" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/64907214-2efbd400-d6f8-11e9-9ea2-69602704ad1b.png" alt="alt text" width="600" height=""></kbd>

### Hints

Create **enum** Weekday and override its **toString()** method:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64907218-3622e200-d6f8-11e9-828b-81a03b2a16a3.png" alt="alt text" width="400" height=""></kbd>

Create **WeeklyEntry** and think about a solution to compare entries:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64907220-3cb15980-d6f8-11e9-9986-34cbc9e6613c.png" alt="alt text" width="700" height=""></kbd>

Create the **WeeklyCalendar**:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64907223-42a73a80-d6f8-11e9-980d-d2dd27f693aa.png" alt="alt text" width="700" height=""></kbd>

<br/>

### Solution: <a title="01 Weekdays" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/7%20ENUMS%20AND%20ANNOTATIONS/p1_Weekdays">01 Weekdays</a>

---

07.02 Warning Levels
--------------------

Create a classes **Logger** and **Message**.

Create **enum Importance** with constants - Low, Normal, Medium, High.

The Logger should have a method that **receives a message**, but **records**
only messages **above or equal to a given importance** level.

Create a method

-   Iterable\<Message\> getMessages()

### Examples

| **Input**                                                                                                  | **Output**                                                                            |
|------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------|
| HIGH <br/> NORMAL: All systems running <br/> HIGH: Leakage in core room <br/> LOW: Food delivery <br/> END | HIGH: Leakage in core room                                                            |
| LOW <br/> NORMAL: All systems running <br/> HIGH: Leakage in core room <br/> LOW: Food delivery <br/> END  | NORMAL: All systems running <br/> HIGH: Leakage in core room <br/> LOW: Food delivery |

<br/>

### Solution: <a title="02 Warning Levels" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/7%20ENUMS%20AND%20ANNOTATIONS/p02_WarningLevels">02 Warning Levels</a>

---

07.03 Coffee Machine
--------------------

Create a class **CoffeeMachine**, with methods:

-   void buyCoffee(String size, String type)

-   void insertCoin(String coin)

-   Iterable\<Coffee\> coffeesSold()

Create **enum CoffeeType** – Espresso, Latte, Irish

Create **enum Coin** – 1, 2, 5, 10, 20, 50 (constants should be named ONE, TWO,
FIVE, etc.)

Create **enum CoffeeSize** that has **dosage** and **price** – Small (50 ml, 50
c), Normal (100 ml, 75 c), Double (200 ml, 100 c)

**CoffeeMachine** should **clear all coins after each successful coffee sold**.

### Examples

| **Input**                                                                         | **Output**                                                                                              |
|-----------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------|
| TEN <br/> TWENTY <br/> TWENTY <br/> Small Espresso <br/> END                      | *(no output) Machine should have only one "Small Espresso" sold*                                        |
| TEN <br/> TWENTY <br/> Small Espresso <br/> TWENTY <br/> Small Espresso <br/> END | *(no output) Machine should have only one "Small Espresso" sold Comment: first try - not enough coins*  |

<br/>

### Solution: <a title="03 Coffee Machine" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/7%20ENUMS%20AND%20ANNOTATIONS/p03_CoffeeMachine">03 Coffee Machine</a>

---

Part II: Annotations
--------------------

07.04 Create Annotation
-----------------------

Create annotation **Subject** with a **String[]** element called **categories**,
that**:**

-   Should be available at runtime

-   Can be placed only on types

###  Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64907230-49ce4880-d6f8-11e9-9807-167bf11df5f9.png" alt="alt text" width="700" height=""></kbd>

<br/>

### Solution: <a title="04 Create Annotation" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/7%20ENUMS%20AND%20ANNOTATIONS/p04_CreateAnnotation">04 Create Annotation</a>

---

07.05 Coding Tracker
--------------------

Create annotation **Author** with a **String** element called **name**, that:

-   Should be available at runtime

-   Can be placed only on methods

Create a class **Tracker** with a method:

-   static void printMethodsByAuthor()

###  Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64907232-4e92fc80-d6f8-11e9-9d4b-3539365ac57c.png" alt="alt text" width="700" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/64907234-518ded00-d6f8-11e9-822d-ed5586ac55d7.png" alt="alt text" width="700" height=""></kbd>

<br/>

### Solution: <a title="05 Coding Tracker" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/7%20ENUMS%20AND%20ANNOTATIONS/p05_CodingTracker">05 Coding Tracker</a>

---