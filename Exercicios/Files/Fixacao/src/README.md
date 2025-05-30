# 📂 CSV Summary Generator in Java

## 📘 Description (English)

This Java console application reads a `.csv` file containing sold items (name, unit price, quantity), calculates the total price for each item, and creates a new file named `summary.csv` in a subfolder named `out` from the same directory as the original file.

Each line of the `summary.csv` will contain:
- Item name
- Total value (unit price × quantity), formatted with 2 decimal places

### ✅ Example Input

CSV file content:

TV LED,1290.99,1  
Video Game Chair,350.50,3  
Iphone X,900.00,2  
Samsung Galaxy 9,850.00,2

### 📝 Example Output

TV LED,1290.99  
Video Game Chair,1051.50  
Iphone X,1800.00  
Samsung Galaxy 9,1700.00

### ▶️ How to Run

1. Compile the Java files:

   `javac application/Program.java entities/Product.java`

2. Run the program:

   `java application.Program`

3. Enter the path to your input CSV file when prompted (e.g. `C:\users\user\input.csv`).

4. The result will be saved as `summary.csv` inside the newly created `out` folder in the same directory as the input file.

---

## 📘 Descrição (Português)

Esta aplicação Java de console lê um arquivo `.csv` contendo itens vendidos (nome, preço unitário, quantidade), calcula o valor total de cada item e cria um novo arquivo chamado `summary.csv` em uma subpasta chamada `out`, localizada no mesmo diretório do arquivo original.

Cada linha do `summary.csv` conterá:
- Nome do item
- Valor total (preço unitário × quantidade), formatado com duas casas decimais

### ✅ Exemplo de Entrada

Conteúdo do arquivo CSV:

TV LED,1290.99,1  
Video Game Chair,350.50,3  
Iphone X,900.00,2  
Samsung Galaxy 9,850.00,2

### 📝 Exemplo de Saída

TV LED,1290.99  
Video Game Chair,1051.50  
Iphone X,1800.00  
Samsung Galaxy 9,1700.00

### ▶️ Como Executar

1. Compile os arquivos Java:

   `javac application/Program.java entities/Product.java`

2. Execute o programa:

   `java application.Program`

3. Informe o caminho para o seu arquivo `.csv` ao ser solicitado (ex: `C:\users\usuario\input.csv`).

4. O resultado será salvo como `summary.csv` dentro da nova pasta `out` no mesmo diretório do arquivo original.
