17 Lab: Object Communication and Events
=======================================

---
---

Problems for exercises and homework for the ["Java OOP Advanced" course \@
SoftUni](https://softuni.bg/courses/java-oop-advanced).

You can check your solutions here:
<https://judge.softuni.bg/Contests/537/Object-Communication-and-Events-Lab> .

---

Part I: Chain of Responsibility, Command Design Pattern
=======================================================

Resources
---------

You are given a file with some classes. Place them in a new project and get
familiar with them.

<kbd><img src="https://user-images.githubusercontent.com/32310938/64926029-5f7b6500-d801-11e9-938a-97ece6285f2c.png" alt="alt text" width="200" height=""></kbd>

17.01 Logger - Chain of Responsibility
--------------------------------------

Create a **Chain of Responsibility** Logger and provide:

-   enum LogType

    -   values - ATTACK, MAGIC, TARGET, ERROR, EVENT

-   interface Handler

    -   void handle(LogType, String)

    -   void setSuccessor(Handler)

-   Concrete loggers that log messages to console:

    -   CombatLogger

    -   EventLogger

Log messages in format (**"TYPE: message"**)

### Solution

Create enum LogType

<kbd><img src="https://user-images.githubusercontent.com/32310938/64926031-6609dc80-d801-11e9-83dc-b23bdfa4e1fa.png" alt="alt text" width="400" height=""></kbd>

Create **Handler** interface

<kbd><img src="https://user-images.githubusercontent.com/32310938/64926032-6b672700-d801-11e9-9701-1cd7188fbb1a.png" alt="alt text" width="500" height=""></kbd>

You can create an **abstract** logger, so you can abstract some of the
functionalities

<kbd><img src="https://user-images.githubusercontent.com/32310938/64926042-7ae67000-d801-11e9-8723-6ea0d2bdd538.png" alt="alt text" width="700" height=""></kbd>

Create a concrete logger that **extends Logger**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64926045-8e91d680-d801-11e9-92d3-818a2a272841.png" alt="alt text" width="600" height=""></kbd>

Test the logger through you client

<kbd><img src="https://user-images.githubusercontent.com/32310938/64926049-95b8e480-d801-11e9-92c8-daf08a7525cb.png" alt="alt text" width="700" height=""></kbd>

Don't forget to **inject the logger** into any model that needs to log/print
messages

<br/>

### Solution: <a title="01 Logger - Chain of Responsibility" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/17%20OBJECT%20COMMUNICATION%20AND%20EVENTS/p01_Logger_Chain_of_Responsibility">01 Logger - Chain of Responsibility</a>

---

17.02 Command
-------------

Create a **Command Pattern** Executor and provide:

-   interface Command

    -   void execute()

-   interface Executor

    -   void executeCommand(Command command)

-   Concrete Executor named **CommandExecutor implements Executor**

-   Concrete Commands

    -   **TargetCommand** with constructor **(Attacker, Target)**

    -   **AttackCommand** with constructor **(Attacker)**

###  Hints

Create the interfaces

Each new command should implement **Command**, so it can be executed by the
**Executor**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64926055-9ea9b600-d801-11e9-9b5c-12ad1a1f8b25.png" alt="alt text" width="500" height=""></kbd>

Create as many commands as you like

Test your commands

<kbd><img src="https://user-images.githubusercontent.com/32310938/64926060-a8331e00-d801-11e9-9741-5020e1aa8c80.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="02 Command" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/17%20OBJECT%20COMMUNICATION%20AND%20EVENTS/p02_Command">02 Command</a>

---

Part II: Mediator, Observer Design Pattern
==========================================

17.03 Mediator
--------------

Implement a Mediator Pattern groups and provide:

-   interface AttackGroup

    -   void addMember(Attacker)

    -   void groupTarget(Target)

    -   void groupAttack()

-   Concrete class **Group** that implements **AttackGroup**

-   Concrete Commands:

    -   **GroupTargetCommand** with constructor **(AttackGroup, Target)**

    -   **GroupAttackCommand** with constructor **(AttackGroup)**

### Hints

Implement **Group implements AttackGroup** - this will be the concrete mediator

<kbd><img src="https://user-images.githubusercontent.com/32310938/64926064-b1bc8600-d801-11e9-90dc-6473bef91c36.png" alt="alt text" width="700" height=""></kbd>

Create some group commands, following the logic from the previous problem

Test the mediator

<kbd><img src="https://user-images.githubusercontent.com/32310938/64926065-b5500d00-d801-11e9-91ce-f166c0f8c764.png" alt="alt text" width="700" height=""></kbd>

<br/>

### Solution: <a title="03 Mediator" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/17%20OBJECT%20COMMUNICATION%20AND%20EVENTS/p03_Mediator">03 Mediator</a>

---

17.04 Observer
--------------

Implement the **Observer Design Pattern** by providing the following:

-   interface **Subject**

    -   void register(Observer)

    -   void unregister(Observer)

    -   void notifyObservers()

-   interface **Observer**

    -   update(int)

If a **Target** dies, it should **send reward** to all of its **Observers**

### Hints

Create the interfaces

**Attacker** should be the **Observer**

\* **Dragon** should be the **Subject** - (the easiest way is to make **Target
extends Subject**, but this is violation of the **Interface Segregation
Principle**). The better solution is to create a new interface
**ObservableTarget** and **implement** both **Target** and **Observer**.

<br/>

### Solution: <a title="04 Observer" href="https://github.com/TsvetanNikolov123/JAVA---OOP-Advanced/tree/master/17%20OBJECT%20COMMUNICATION%20AND%20EVENTS/p04_Observer">04 Observer</a>

---