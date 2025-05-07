### 🏦 Bank Account Registration and Operations (Encapsulation)

**Problem Statement**

In a bank system, to register a bank account, the user must provide:

- The **account number**
- The **account holder’s name**
- An optional **initial deposit amount**

If the user chooses not to provide an initial deposit, the account balance will start at **$0.00**.

Key rules:
- The **account number** is immutable after registration.
- The **account holder's name** can be updated.
- The **account balance** cannot be freely changed. It can only be increased via **deposits**, and decreased via **withdrawals**.
- Each **withdrawal** is charged a **$5.00 fee**.
- The account balance may become **negative** if the withdrawal amount plus fee exceeds the available balance.

The program should:
1. Register a new bank account with or without an initial deposit
2. Perform a deposit operation
3. Perform a withdrawal operation
4. Display the account data after each step

> 💡 Use encapsulation to ensure that balance changes can only happen through controlled operations (deposit and withdraw methods).

**Example:**

Enter account number: 8532
Enter account holder: Alex Green
Is there an initial deposit (y/n)? y
Enter initial deposit value: 500.00

Account data:
Account 8532, Holder: Alex Green, Balance: $ 500.00

Enter a deposit value: 200.00

Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 700.00

Enter a withdraw value: 300.00

Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 395.00
