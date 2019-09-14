10 Exercises: Reflection
========================

---
---

This document defines the exercises for ["Java OOP Advanced" course \@ Software
University](https://softuni.bg/courses/java-oop-advanced). Please submit your
solutions (source code) of all below described problems in
<https://judge.softuni.bg/Contests/258/Reflection-Exercises> .

---

10.01 Harvesting Fields
-----------------------

You are given a **RichSoilLand** class with lots of fields (look at the provided
skeleton). Like the good farmer you are, you must harvest them. Harvesting means
that you must print each **field** in a certain format (see output).

### Input

You will receive a maximum of 100 lines with one of the following commands:

-   **private -** print all private fields

-   **protected** - print all protected fields

-   **public** - print all public fields

-   **all** - print ALL declared fields

-   **HARVEST** - end the input

### Output

For each command you must print the **fields** that have the **given access
modifier** as described in the input section. The format in which the fields
should be printed is:

**"\<access modifier\> \<field type\> \<field name\>"**

### Examples

| **Input**                                        | **Output**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
|--------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| protected <br/> HARVEST                          | protected String testString <br/> protected double aDouble <br/> protected byte testByte <br/> protected StringBuilder aBuffer <br/> protected BigInteger testBigNumber <br/> protected float testFloat <br/> protected Object testPredicate <br/> protected Object fatherMotherObject <br/> protected String moarString <br/> protected Exception inheritableException <br/> protected Stream moarStreamz                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| private <br/> public <br/> private <br/> HARVEST | private int testInt <br/> private long testLong <br/> private Calendar aCalendar <br/> private char testChar <br/> private BigInteger testBigInt <br/> private Thread aThread <br/> private Object aPredicate <br/> private Object hiddenObject <br/> private String anotherString <br/> private Exception internalException <br/> private Stream secretStream <br/> public double testDouble <br/> public String aString <br/> public StringBuilder aBuilder <br/> public short testShort <br/> public byte aByte <br/> public float aFloat <br/> public Thread testThread <br/> public Object anObject <br/> public int anotherIntBitesTheDust <br/> public Exception justException <br/> public Stream aStream <br/> private int testInt <br/> private long testLong <br/> private Calendar aCalendar <br/> private char testChar <br/> private BigInteger testBigInt <br/> private Thread aThread <br/> private Object aPredicate <br/> private Object hiddenObject <br/> private String anotherString <br/> private Exception internalException <br/> private Stream secretStream                                             |
| all <br/> HARVEST                                | private int testInt <br/> public double testDouble <br/> protected String testString <br/> private long testLong <br/> protected double aDouble <br/> public String aString <br/> private Calendar aCalendar <br/> public StringBuilder aBuilder <br/> private char testChar <br/> public short testShort <br/> protected byte testByte <br/> public byte aByte <br/> protected StringBuilder aBuffer <br/> private BigInteger testBigInt <br/> protected BigInteger testBigNumber <br/> protected float testFloat <br/> public float aFloat <br/> private Thread aThread <br/> public Thread testThread <br/> private Object aPredicate <br/> protected Object testPredicate <br/> public Object anObject <br/> private Object hiddenObject <br/> protected Object fatherMotherObject <br/> private String anotherString <br/> protected String moarString <br/> public int anotherIntBitesTheDust <br/> private Exception internalException <br/> protected Exception inheritableException <br/> public Exception justException <br/> public Stream aStream <br/> protected Stream moarStreamz <br/> private Stream secretStream |

<br/>

### Solution: <a title="01 Harvesting Fields" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/10%20EXERCISE%20REFLECTION/pr01HarvestingFields">01 Harvesting Fields</a>

---

10.02 Black Box Integer
-----------------------

You are helping a buddy of yours who is still in the OOP Basics course - his
name is Peshoslav (not to be mistaken with real people or trainers). He is
rather slow and made a class with all private members. Your tasks are to
**instantiate** an object from his class (always with start value 0) and then
**invoke** the different methods it has. Your restriction is to **not** change
anything in the class itself (consider it a black box). You can look at his
class but don't touch anything! The class itself is called **BlackBoxInt.** It
is a wrapper for the **int** primitive. The methods it has are:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64910645-2f5c9500-d721-11e9-9d43-501352b9607c.png" alt="alt text" width="350" height=""></kbd>

### Input

The input will consist of lines in the form:

**\<command name\>_\<value\>**

For instance: **add_115**

Input will always be valid and in the format described, so there is no need to
check it explicitly. You stop receiving input when you encounter the command
"**END**".

### Output

Each command (except the **END** one) should print the current value of
**innerValue** of the BlackBoxInt object you instantiated. **Don't cheat** by
overriding toString in the class - you must get the value from the **private**
field.

### Examples

| **Input**                                                                                                   | **Output**                                                               |
|-------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| add_999999 <br/> subtract_19 <br/> divide_4 <br/> multiply_2 <br/> rightShift_1 <br/> leftShift_3 <br/> END | 999999 <br/> 999980 <br/> 249995 <br/> 499990 <br/> 249995 <br/> 1999960 |

<br/>

### Solution: <a title="02 Black Box Integer" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/10%20EXERCISE%20REFLECTION/pr02PrivateClassFiddling">02 Black Box Integer</a>

---

10.03 BarracksWars - A New Factory
----------------------------------

You are given a small console based project called Barracks (the code for it is
included in the provided skeleton).

The general functionality the project has is adding new units to its repository
and printing a report with statistics about the units currently in the
repository. First let's go over the original task the project was made for:

### Input

The input consists of commands each on a separate line. Commands that execute
the functionality are:

-   **add** \<**Archer**/**Swordsman**/**Pikeman/{…}**\> - adds a unit to the
    repository.

-   **report** - prints a lexicological ordered statistic about the units in the
    repository.

-   **fight** - ends the input.

### Output

Each command except **fight** should print output on the console.

-   **add** should print: "\<**Archer**/**Swordsman**/**Pikeman**/**{…}\>
    added!**"

-   **report** should print all the info in the repository in the format:
    "\<**UnitType**\> **-\>** \<**UnitQuantity**\>", sorted by UnitType

### Constraints

-   Input will consist of no more than **1000** lines

-   **report** command will never be given before any valid add command was
    provided

### Your task

1) You have to **study the code of the project and figure out how it works**.
However, there are parts of it that are not implemented (left with TODOs). You
must implement the functionality of the **createUnit** method in the
**UnitFactoryImpl** class so that it creates a unit based on the unit type
received as parameter. Implement it in such a way that whenever you add a new
unit it will be creatable without the need to change anything in the
**UnitFactoryImpl** class (psst - use reflection). You can use the approach
called Simple Factory.

2) Add two new unit classes (there will be tests that require them) -
**Horseman** with 50 health and 10 attack and **Gunner** with 20 health and 20
attack.

If you do everything correctly for this problem, you should write code only in
the **factories** and **units** packages.

### Examples

| **Input**                                                                                                                                                        | **Output**                                                                                                                                                                                                                                           |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| add Swordsman <br/> add Archer <br/> add Pikeman <br/> report <br/> add Pikeman <br/> add Pikeman <br/> report <br/> fight                                       | Swordsman added! <br/> Archer added! <br/> Pikeman added! <br/> Archer -\> 1 <br/> Pikeman -\> 1 <br/> Swordsman -\> 1 <br/> Pikeman added! <br/> Pikeman added! <br/> Archer -\> 1 <br/> Pikeman -\> 3 <br/> Swordsman -\> 1 <br/>                  |
| add Pikeman <br/> add Pikeman <br/> add Gunner <br/> add Horseman <br/> add Archer <br/> add Gunner <br/> add Gunner <br/> add Horseman <br/> report <br/> fight | Pikeman added! <br/> Pikeman added! <br/> Gunner added! <br/> Horseman added! <br/> Archer added! <br/> Gunner added! <br/> Gunner added! <br/> Horseman added! <br/> Archer -\> 1 <br/> Gunner -\> 3 <br/> Horseman -\> 2 <br/> Pikeman -\> 2 <br/> |

<br/>

### Solution: <a title="03 BarracksWars - A New Factory" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/10%20EXERCISE%20REFLECTION/pr03_BarracksWars_%20A_New_Factory/pr0304Barracks">03 BarracksWars - A New Factory</a>

---

10.04 \* BarracksWars - The Commands Strike Back
------------------------------------------------

As you might have noticed commands in the project from Problem 3 are implemented
via a switch case with method calls in the **Engine** class. Although this
approach works it is flawed when you add a new command because you have to add a
new case for it. In some projects you might not have access to the engine and
this would not work. Imagine this project will be outsourced and the outsourcing
firm will not have access to the engine. Make it so whenever they want to add a
new command they won't have to change anything in the **Engine.**

To do so employ the design pattern called [Command
Pattern](https://en.wikipedia.org/wiki/Command_pattern). Here is how the base
(abstract) command should look like:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64910646-31265880-d721-11e9-8367-5d9cd6309005.png" alt="alt text" width="500" height=""></kbd>

Notice how all commands that extend this one will have both a Repository and a
UnitFactory although not all of them need these. Leave it like this for this
problem, because for the reflection to work we need all constructors to accept
the same parameters. We will see how to go around this issue in problem 5.

Once you've implemented the pattern add a new command. It will have the
following syntax:

-   **retire** \<**UnitType**\> - All it has to do is **remove** a unit of the
    provided type from the repository.

    -   If there are no such units currently in the repository print: "**No such
        units in repository.**"

    -   If there is such a unit currently in the repository, print:
        "**\<UnitType\> retired!**"

To implement this command, you will also have to implement a corresponding
method in the **UnitRepository**.

If you do everything correctly for this problem, you should write/refactor code
only in the **core** and **data** packages.

### Examples

| **Input**                                                                                                                                                                                                                                                                            | **Output**                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| retire Archer <br/> add Pikeman <br/> add Pikeman <br/> add Gunner <br/> add Horseman <br/> add Archer <br/> add Gunner <br/> add Gunner <br/> add Horseman <br/> report <br/> retire Gunner <br/> retire Archer <br/> report <br/> retire Swordsman <br/> retire Archer <br/> fight | No such units in repository. <br/> Pikeman added! <br/> Pikeman added! <br/> Gunner added! <br/> Horseman added! <br/> Archer added! <br/> Gunner added! <br/> Gunner added! <br/> Horseman added! <br/> Archer -\> 1 <br/> Gunner -\> 3 <br/> Horseman -\> 2 <br/> Pikeman -\> 2 <br/> Gunner retired! <br/> Archer retired! <br/> Archer -\> 0 <br/> Gunner -\> 3 <br/> Horseman -\> 2 <br/> Pikeman -\> 2 <br/> No such units in repository. <br/> No such units in repository. |

<br/>

### Solution: <a title="04 *BarracksWars - The Commands Strike Back" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/10%20EXERCISE%20REFLECTION/pr04_BarracksWars_The_Commands_Strike_Back/pr0304Barracks">04 \* BarracksWars - The Commands Strike Back</a>

---

10.05 \* BarracksWars - Return of the Dependencies
--------------------------------------------------

In the final part of this epic problem trilogy we will resolve the issue where
all Commands received all utility classes as parameters in their constructors.
We can accomplish this by using an approach called **dependency injection
container**. This approach is used in many frameworks like **Spring** for
instance.

We will do a little twist on that approach. Remove all fields from the abstract
command except the **data.** Instead put whatever fields each command needs in
the concrete class. Create an annotation called **Inject** and make it so it can
be used only on fields. Put the annotation over the fields we need to set trough
reflection. Once you've prepared all of this, write the necessary reflection
code in the **Command Interpreter** (which you should have refactored out from
the engine in problem 4).

Use the tests from problem 4 to test your solution.

<br/>

### Solution: <a title="05 *BarracksWars - Return of the Dependencies" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/10%20EXERCISE%20REFLECTION/pr5_BarracksWars_Return_of_the_Dependencies/pr0304Barracks">05 \* BarracksWars - Return of the Dependencies</a>

---