# SPRINT1.03 — Java Enums & Dates

In this sprint, we work with two fundamental Java concepts that help you write clearer, safer, and more robust code: **enums**, used to represent finite and controlled sets of values, and **dates and times** using the Java Time API, which provides a modern and reliable way to work with temporal data.

---

## TASK 1 — LEVEL 1

### 📌 Exercise Statement — Enums

Enums (enumerations) allow you to define a fixed set of constant values with meaningful names, improving type safety and code readability. They are commonly used to represent closed options such as days of the week, priority levels, or states. Unlike `String` or `int`, enums prevent invalid values and can also include behavior through methods.

**Exercises**

1. Create an enum called `Day` with the days of the week.  
   Create a function that receives a `Day` and prints whether it is a working day or a weekend.

2. Create an enum `Level` with the values `LOW`, `MEDIUM`, and `HIGH`.  
   Create a `Task` class with a `Level` property and show how the behavior changes depending on the level.

3. Add methods inside the enum and verify that they can contain logic  
   (for example, a `getColor()` method for each `Level`).

4. Convert a `String` to an enum using `valueOf` and handle errors when the value is not valid.

This level focuses on understanding how enums replace primitive constants and strings with safer, more expressive types.

---

## TASK 1 — LEVEL 2

### 📌 Exercise Statement — Dates and Times

Working with dates and times is essential in many applications. Since Java 8, the `java.time` API offers a clear and robust alternative to the old `Date` class, making it easier to represent, manipulate, and format temporal data correctly.

In this level, you will practice using the most common classes from the Java Time API and performing typical time-related operations.

**Exercises**

1. Display the current date and time using `LocalDate`, `LocalTime`, and `LocalDateTime`.

2. Calculate the difference between two dates using `Period` or `Duration`.

3. Add or subtract days, months, or hours from a date.

4. Format a date using `DateTimeFormatter` with different formats.

5. Create a function that checks whether a given date (passed as a parameter) is earlier than today.

6. Create a simple agenda that stores appointments as `LocalDateTime` and displays the upcoming ones.

This level focuses on building confidence with Java’s modern date and time API and applying it to realistic use cases.

---

## 🛠 Technologies

- Java: 21 (LTS)
- IDE: IntelliJ IDEA
- Version Control: Git
- Repository Hosting: GitHub

---

## 🚀 Installation and Execution

### Prerequisites
- Java Development Kit (JDK) 8+ is required.

### Clone the repository

```bash
git clone https://github.com/Dani87dev/S1T9-JAVA-ENUM-DATES-RECORDS.git
