### 🧾 Employee Salary Update with Encapsulation

**Problem Statement**

Write a program to register data for **N employees**, including **ID**, **name**, and **salary**. Ensure that **IDs are unique**—no duplication is allowed.

After registering the employees, the program should allow a **percentage-based salary increase** for a specific employee. The user will input an ID and the percentage. If the given ID does not exist, show an appropriate message and abort the operation.

Finally, display the **updated list of employees**.

> 💡 Use **encapsulation** to prevent direct modification of salaries. The salary can only be increased via a method that applies a percentage.

**Example:**

How many employees will be registered? 3

Employee #1:
Id: 333
Name: Maria Brown
Salary: 4000.00

Employee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00

Employee #3:
Id: 772
Name: Bob Green
Salary: 5000.00

Enter the employee id that will have salary increase: 536
Enter the percentage: 10.0

List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3300.00
772, Bob Green, 5000.00

