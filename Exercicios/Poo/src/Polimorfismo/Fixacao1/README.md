# 🏷️ Product Price Tag Generator – Inheritance and Method Overriding 

## 📋 Descrição (Português)

Fazer um programa para ler os dados de **N produtos** (N fornecido pelo usuário). Ao final, mostrar a **etiqueta de preço de cada produto** na mesma ordem em que foram digitados.

### Cada produto pode ser:
- **Comum**: possui apenas nome e preço.
- **Importado**: possui uma taxa de alfândega (customs fee).
- **Usado**: possui uma data de fabricação (manufacture date).

### 🧾 Regras de exibição
- A etiqueta de preço de cada produto deve conter as informações específicas de acordo com seu tipo.
- Para produtos **importados**, a taxa de alfândega é **acrescentada ao preço final**.
- Para produtos **usados**, a **data de fabricação** deve ser exibida na etiqueta.

### 🧱 Diagrama de classes

        Product

    -name : String
    -price : Double
    +priceTag() : String

                ▲ 
                │
    │ -----------------------------│
    ┌──────────────┐        ┌───────────────
    │ImportedProduct│        │ UsedProduct │
    └──────────────┘        └───────────────

    -customsFee : Double       -manufactureDate : Date
    +priceTag() : String       +priceTag() : String
    +totalPrice() : Double

---

# 🏷️ Product Price Tag Generator – Inheritance and Method Overriding 

## 📋 Description (English)

Build a program to read data of **N products** (user-defined). At the end, display the **price tag for each product** in the same order they were entered.

### Each product can be:
- **Common**: has only a name and a price.
- **Imported**: has a customs fee.
- **Used**: has a manufacture date.

### 🧾 Price tag rules
- Each product's price tag should reflect its specific data.
- For **imported** products, the **customs fee is added** to the final price.
- For **used** products, the **manufacture date** must appear in the tag.