15 Lab: Dependency Inversion and Interface Segregation Principles
=================================================================

---
---

Problems for exercises and homework for the ["Java OOP Advanced" course \@
SoftUni](https://softuni.bg/courses/java-oop-advanced).

---

Part I: Dependency Inversion
============================

15.1 System Resources
---------------------

You are given a **GreetingClock.** It has the following behavior:

-   if hour \< 12, prints **"Good morning…"**

-   if hour \< 18, prints **"Good afternoon…"**

-   else prints **"Good evening…"**

Refactor the code so that it conforms to the Dependency Inversion principle.

\* Optional: Introduce **Strategy Design Pattern**

### Solution

Create a new interface **TimeProvider** that has a single method
**getHour():int**

Create an implementation of the interface that can provide the hour (You can use
**LocalTime** java class)

Inject **TimeProvider** through the clock's constructor

Create a new interface **Writer** that has a single method
**println(String):void**

Create an implementation that uses a class that can print to the console

Inject **Writer** through the clock's constructor and use it to write to the
console

<kbd><img src="https://user-images.githubusercontent.com/32310938/64921415-c1b97300-d7cb-11e9-9b0c-8aa2ad268ce9.png" alt="alt text" width="800" height=""></kbd>

<br/>

### Solution: <a title="1 System Resources" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/15%20INTERFACE%20SEGREGATION%20DEPENDENCY%20INVERSION%20PRINCIPLES/p01_system_resources">1 System Resources</a>

---

15.02 Services
--------------

You are given some classes:

-   OnlineStoreOrder

-   SmsNotificationService

-   EmailNotificationService

Once the order is **processed** it should **send** the proper **notifications**
through the services, if they are active.

Refactor the classes so that they conform the Dependency Inversion principle

\* Optional: Introduce **Composite Design Pattern**

### Solution

Introduce a new interface called **NotificationService** and make all
notification services to implement it

Either inject variable number of parameters in the **OnlineStoreOrder** or
create a **CompositeNotificationService** implementation

**CompositeNotificationService** should implement **NotificationService**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64921428-ce3dcb80-d7cb-11e9-821f-c509a90e1ad0.png" alt="alt text" width="800" height=""></kbd>

<br/>

### Solution: <a title="02 Services" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/15%20INTERFACE%20SEGREGATION%20DEPENDENCY%20INVERSION%20PRINCIPLES/p02_services">02 Services</a>

---

15.03 Employee Info
-------------------

You are given the classes:

-   Employee

-   EmployeeInfoProvider

-   EmployeeDatabase

-   ConsoleFormatter

EmployeeInfoProvider **provides a list of employees to be formatted to a**
String **by the** ConsoleFormatter**. Then the string is printed to the
console.** Refactor the classes and the structure to conform to the **Dependency
Inversion** principle.

### Hints

Create an abstraction between every layer of the application

Create a **ConsoleClient** which will run the application. Define the
abstractions by using as a guide the **ConsoleClient**'s needs (It needs some
kind of Formatter and some kind of **InfoProvider**)

**EmployeeInfoProvider** needs a database, so define abstraction by looking at
what methods **EmployeeInfoProvider** needs

<kbd><img src="https://user-images.githubusercontent.com/32310938/64921430-d564d980-d7cb-11e9-835f-1b636abfc123.png" alt="alt text" width="800" height=""></kbd>

<br/>

### Solution: <a title="03 Employee Info" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/15%20INTERFACE%20SEGREGATION%20DEPENDENCY%20INVERSION%20PRINCIPLES/p03_employee_info">03 Employee Info</a>

---

Part II: Interface Segregation
==============================

15.04 Recharge
--------------

You are given a library with the following classes

-   Worker implements Sleeper

-   Employee extends Worker

-   Robot extends Worker

-   RechargeStation

If you inspect the code, you can see that some of the classes have methods that
they can't use (throw **UnsupportedOpperationException**) which is clear
indication that the code should be refactored.

Refactor the structure so that it conforms to the **Interface Segregation**
principle.

### Hints

Make the **Robot** to extend **Worker** and at the same time to implement
**Rechargeable**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64921434-db5aba80-d7cb-11e9-960e-a82983abe581.png" alt="alt text" width="800" height=""></kbd>

<br/>

### Solution: <a title="04 Recharge" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/15%20INTERFACE%20SEGREGATION%20DEPENDENCY%20INVERSION%20PRINCIPLES/p04_recharge">04 Recharge</a>

---

15.05 Security Door
-------------------

You are given:

-   SecurityManager

-   abstract class SecurityCheck

-   interface SecurityUI

**SecurityManager** which can interact with a user by validating his key card or
by getting his pin code. Both methods are provided by an interface called
**SecurityUI**. The validation is performed by the appropriate **SecurityCheck**
class.

Refactor the structure so that it conforms to the **Interface Segregation**
principle.

### Hints

Split **SecurityUI** into smaller role interfaces, one for each
**SecurityCheck** class.

<kbd><img src="https://user-images.githubusercontent.com/32310938/64921437-ddbd1480-d7cb-11e9-9658-dc02fead9ebb.png" alt="alt text" width="800" height=""></kbd>

<br/>

### Solution: <a title="05 Security Door" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/15%20INTERFACE%20SEGREGATION%20DEPENDENCY%20INVERSION%20PRINCIPLES/p05_security_system">05 Security Door</a>

---