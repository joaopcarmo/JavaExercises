# 💼 Sistema de Pagamento de Funcionários – Herança e Polimorfismo (Java)

## 📋 Descrição (Português)

Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar:

- Nome
- Horas trabalhadas
- Valor por hora

Funcionários **terceirizados** possuem ainda uma **despesa adicional**.

### 💰 Regra de pagamento

- Funcionário comum: `pagamento = horas * valorPorHora`
- Funcionário terceirizado: além do valor acima, recebe um **bônus de 110% da despesa adicional**

### 🧮 Objetivo

1. Ler os dados de `N` funcionários (sendo N informado pelo usuário).
2. Armazenar todos em uma lista.
3. Ao final, exibir o **nome** e o **pagamento** de cada funcionário na ordem em que foram digitados.

### 🧱 Diagrama de classes

        Employee
    -name : String
    -hours : Integer
    -valuePerHour : Double
    +payment() : Double

            ▲
            │
         OutsourcedEmployee
    additionalCharge : Double


---

# 💼 Employee Payment System – Inheritance and Polymorphism (Java)

## 📋 Description (English)

A company has both regular and outsourced employees. For each employee, the program should record:

- Name
- Hours worked
- Value per hour

Outsourced employees also have an **additional charge**.

### 💰 Payment rule

- Regular employee: `payment = hours * valuePerHour`
- Outsourced employee: same as above **plus 110% of the additional charge**

### 🧮 Objective

1. Read the data of `N` employees (N provided by the user).
2. Store all employees in a list.
3. At the end, display each employee's **name** and **payment**, in the order entered.



