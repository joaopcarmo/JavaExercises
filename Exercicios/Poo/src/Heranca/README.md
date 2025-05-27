# Bank System – Inheritance, Polymorphism, Upcasting and Downcasting

This project is a simple **object-oriented bank system** developed in Java. It demonstrates key OOP principles such as **inheritance**, **method overriding**, **upcasting**, and **downcasting**, using different types of accounts.

## Features

- Three types of accounts:
    - **Account**: A basic bank account with a standard withdrawal fee.
    - **SavingsAccount**: A specialized account that earns interest and has no withdrawal fee.
    - **BusinessAccount**: Allows business-specific operations such as loans and includes an additional withdrawal fee.

- Demonstrates:
    - Inheritance and method overriding
    - Polymorphism via overridden `withdraw` method
    - Safe type casting (`instanceof` with upcasting and downcasting)
    - Encapsulation and access control

## Project Structure

Heranca/  
├── application/  
│   └── Program.java  
└── entities/  
  ├── Account.java  
  ├── BusinessAccount.java  
  └── SavingsAccount.java

## How to Run

1. Clone the repository or download the source code.
2. Open the project in your preferred IDE (e.g., IntelliJ, Eclipse, VS Code).
3. Run the `Program.java` file.
4. Observe the output for different behaviors of each account type and the casting logic.


## Concepts Demonstrated

- **Inheritance**: Code reuse and specialization through class hierarchy.
- **Polymorphism**: Common interface (`withdraw`) behaves differently depending on the object.
- **Upcasting**: Using a subclass as a superclass to simplify design.
- **Downcasting**: Accessing subclass-specific behavior, safely checked with `instanceof`.
- **Encapsulation**: Data protection and access via getters and setters.

## Author

Developed by [João Carmo] as part of Object-Oriented Programming practice in Java.


