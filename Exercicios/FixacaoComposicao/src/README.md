# Order Summary with Composition and Enum

This exercise demonstrates object composition and enum usage in Java through a simple order system.

## Features

- Register a client with name, email, and birth date
- Create an order with multiple items and associated products
- Calculate item subtotals and order total
- Display a formatted summary of the order

## Topics practiced

- Object-Oriented Programming (OOP)
    - Object composition (has-a relationships)
    - Enums (`OrderStatus`)
    - Date/time handling with `LocalDate` and `LocalDateTime`
    - List management and encapsulation

## Example input/output

```text
Enter client data:
Name: Alex Green
Email: alex@gmail.com
Birth date (DD/MM/YYYY): 15/03/1985
Enter order data:
Status: PROCESSING
How many items to this order? 2

Enter #1 item data:
Product name: TV
Product price: 1000.00
Quantity: 1

Enter #2 item data:
Product name: Mouse
Product price: 40.00
Quantity: 2

ORDER SUMMARY:
Order moment: 20/04/2018 11:25:09
Order status: PROCESSING
Client: Alex Green (15/03/1985) - alex@gmail.com
Order items:
TV, $1000.00, Quantity: 1, Subtotal: $1000.00
Mouse, $40.00, Quantity: 2, Subtotal: $80.00
Total price: $1080.00



Enunciado Completo em português: https://docs.google.com/document/d/1bmWL5ncXrMkCyi1Xl6ZBrGxZTtbmX9rhI9IsOEnf3zw/edit?tab=t.0