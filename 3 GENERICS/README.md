03 Lab: Generics
================

Problems for exercises and homework for the ["Java OOP Advanced" course \@
SoftUni](https://softuni.bg/courses/java-oop-advanced).

You can check your solutions here:
<https://judge.softuni.bg/Contests/521/Generics-Lab> .

Part I: Generics
----------------

03.01 Jar of T
--------------

Create a class **Jar\<\>** that can store **anything**.

It should have two public methods:

-   void add(element)

-   element remove()

Adding should add on **top** of its contents. Remove should get the **topmost**
element.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64895195-7cd6f480-d684-11e9-97c1-72b690ca5fd7.png" alt="alt text" width="400" height=""></kbd>

### Hints

Use the syntax **Jar\<T\>** to create a generic class

<br/>

### Solution: <a title="01 Jar of T" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/3%20GENERICS/p01_JarOfT">01 Jar of T</a>

---

03.02 Generic Array Creator
---------------------------

Create a class **ArrayCreator** with a method and a single overload to it:

-   static T[] create(int length, T item)

-   static T[] create(Class\<T\>, int length, T item)

The method should return an array with the given length and every element should
be set to the given default item.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64895339-ebb44d80-d684-11e9-9d7c-48a0c70e479a.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="02 Generic Array Creator" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/3%20GENERICS/p02_GenericArrayCreator">02 Generic Array Creator</a>

---

Part II: Type Parameter Bounds
------------------------------

03.03 Generic Scale
-------------------

Create a class **Scale\<T\>** that holds two elements - left and right. The
scale should receive the elements through its single constructor:

-   Scale(T left, T right)

The scale should have a single method:

-   T getHeavier()

The greater of the two elements is heavier. The method should return **null** if
elements are equal.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64895404-261dea80-d685-11e9-98b4-420338cfa161.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="03 Generic Scale" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/3%20GENERICS/p03_GenericScale">03 Generic Scale</a>

---

03.04 List Utilities
--------------------

Create a class **ListUtils** that you will use through several other exercises:

The class should have two static methods:

-   T getMin(List\<T\> list)

-   T getMax(List\<T\> list)

The methods should throw **IllegalArgumentException** if an empty list is
passed.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64895487-6a10ef80-d685-11e9-9686-0252c052c4e9.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="04 List Utilities" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/3%20GENERICS/p04_ListUtilities">04 List Utilities</a>

---

03.05 Null Finder
-----------------

Add a method to your **ListUtils** class that finds the index of every **null**
element in a given list with the method:

-   static List\<Integer\> getNullIndices(List\<\> list)

Add the appropriate **generic syntax** to the signature. The method should work
with any **List\<\>**.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64895599-ab090400-d685-11e9-850c-333641d82580.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="05 Null Finder" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/3%20GENERICS/p05_NullFinder">05 Null Finder</a>

---

03.06 Generic Flat Method
-------------------------

In **ListUtils**, create a generic static method that flattens a
**List\<List\<\>\>** into a resulting **List\<\>**

-   void flatten(List\<\> destination, List\<List\<\>\> source)

Add the appropriate generic syntax to the signature. The method should work with
any **List\<\>**.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64895753-27034c00-d686-11e9-9b6d-7089ac2fce94.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="06 Generic Flat Method" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/3%20GENERICS/p06_GenericFlatMethod">06 Generic Flat Method</a>

---

03.07 Generic Add All Method
----------------------------

In **ListUtils**, create a generic static method that **adds all elements from a
given source** list **to a given destination** list with the static method:

-   void addAll(List\<\> destination, List\<\> source)

Add the appropriate generic syntax to the signature. The method should work with
any **List\<\>**.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64895757-2965a600-d686-11e9-9271-cc1e2e0a759b.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="07 Generic Add All Method" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/3%20GENERICS/p07_GenericAddAllMethod">07 Generic Add All Method</a>

---