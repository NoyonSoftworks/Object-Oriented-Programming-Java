# 🧩 Java OOP Definitions (Simple & Exam-Ready)

---

## **1️⃣ Class**
A **class** is a blueprint or model from which objects are created.  
It defines variables (data) and methods (actions).

---

## **2️⃣ Object**
An **object** is an instance of a class.  
It represents a real-world thing and is created using the `new` keyword.

---

## **3️⃣ Constructor**
A **constructor** is a special method that runs automatically when an object is created.  
It initializes object data.

---

## **4️⃣ Inheritance**
**Inheritance** means one class can use the features of another class.  
The `extends` keyword is used for inheritance.  
It helps in code reuse.

---

## **5️⃣ Polymorphism**
**Polymorphism** means “many forms.”  
It allows one method name to work in different ways.  
Types of polymorphism:  
- Compile-time (Method Overloading)  
- Run-time (Method Overriding)

---

## **6️⃣ Method Overloading**
When the same class has multiple methods with the same name but **different parameters**, it is called **Method Overloading**.  
This is **Compile-time Polymorphism**.

---

## **7️⃣ Method Overriding**
When a child class has a method with the same name and parameters as the parent class, it is called **Method Overriding**.  
This is **Run-time Polymorphism**.

---

## **8️⃣ Encapsulation**
**Encapsulation** means combining data and methods together and keeping data safe from direct access.  
It is done using `private` variables and **getter/setter** methods.

---

## **9️⃣ Abstraction**
**Abstraction** means hiding unnecessary details and showing only the important features.  
It is achieved using **abstract classes** and **interfaces**.

---

## **🔟 Interface**
An **interface** is a collection of abstract methods.  
A class uses the `implements` keyword to give its own code for those methods.

---

## **11️⃣ Getter and Setter**
**Getter** and **Setter** methods are used to safely read and change private variables.  
They are part of **Encapsulation**.

---

## **12️⃣ Constructor Overloading**
If a class has more than one constructor with different parameter lists, it is called **Constructor Overloading**.

---

## **13️⃣ instanceof Operator**
The `instanceof` operator checks if an object belongs to a specific class or subclass.  
It returns **true** or **false**.

---

## **14️⃣ Call by Reference**
When an object reference is passed to a method, and any change inside the method affects the original object, it is called **Call by Reference**.

---

## **15️⃣ this Keyword**
The `this` keyword refers to the **current object**.  
It helps to remove confusion between local and instance variables.

---

## **16️⃣ super Keyword**
The `super` keyword is used to access the **parent class methods or constructor**.

---

## **17️⃣ final Keyword**
- `final variable` → value cannot be changed (constant)  
- `final method` → cannot be overridden  
- `final class` → cannot be inherited  

---

## **18️⃣ static Keyword**
`static` means a variable or method belongs to the class, not to an object.  
You can access it without creating an object.

---

## **19️⃣ Package**
A **package** is a group of related classes used to organize code.  
Defined using:  
```java
package mypackage;

| Modifier    | Description                     |
| ----------- | ------------------------------- |
| `public`    | Can be accessed from anywhere   |
| `private`   | Only inside the same class      |
| `protected` | In the same package or subclass |
| *(default)* | In the same package only        |

21️⃣ Abstract Class

An abstract class cannot create objects.
It may have abstract methods that must be written in the child class.

22️⃣ Exception Handling

Exception Handling is used to handle program errors without stopping the program.
It uses try, catch, and finally blocks.

23️⃣ File Handling

Used to read and write files in Java using classes like File, FileReader, and FileWriter.

24️⃣ Data Hiding

Data Hiding means keeping variables private so they cannot be accessed directly from outside the class.
It is part of Encapsulation.


| Pillar            | Description                              |
| ----------------- | ---------------------------------------- |
| **Encapsulation** | Data protection and hiding               |
| **Inheritance**   | Code reusability                         |
| **Polymorphism**  | Many forms of one action                 |
| **Abstraction**   | Hiding complexity and showing essentials |

✅ Summary

Java OOP (Object-Oriented Programming) helps to write organized, reusable, and secure code.
By using classes, objects, inheritance, encapsulation, abstraction, and polymorphism, Java makes programs easy to manage and extend.



