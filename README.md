# 🛒 Bill Generator — XYZ Store

> A console-based retail billing system built with Java | Student Project #2

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![CLI](https://img.shields.io/badge/Interface-CLI-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Year](https://img.shields.io/badge/Built%20In-2024-purple?style=for-the-badge)

---

## 📌 About the Project

**Bill Generator** is a console-based Java application that simulates a retail store billing system. The program allows customers to select items from a predefined inventory, calculates the total bill with GST, and includes a fun **Christmas Lucky Draw** feature for discount offers.

This is my **second Java project**, aimed at strengthening core Java concepts like `switch-case`, `loops`, `Scanner input`, `Random`, and static methods.

---

## ✨ Features

- 🛍️ **Item Selection** — Choose from 16 store items with live pricing
- 🔢 **Quantity Input** — Enter quantity for each selected item
- 🧾 **Itemized Bill** — Displays a formatted customer order list
- 💰 **Total Calculation** — Computes total cost before and after GST
- 📊 **GST (18%)** — Automatically applies 18% tax on the total
- 🎄 **Lucky Draw** — Random discount (0–20%) via Christmas offer
- ✅ **Input Validation** — Handles unavailable items gracefully

---

## 🏪 Available Items & Prices

| Item       | Price (₹) | Unit   |
|------------|-----------|--------|
| Egg        | 5         | piece  |
| Notebook   | 30        | piece  |
| Pen        | 5         | piece  |
| Pencil     | 5         | piece  |
| Biscuits   | 7         | piece  |
| Sugar      | 40        | piece  |
| Ghee       | 300       | litre  |
| Milk       | 55        | litre  |
| Soap       | 15        | piece  |
| Candle     | 3         | piece  |
| Batteries  | 7         | piece  |
| Tape       | 7         | piece  |
| Shampoo    | 2         | piece  |
| Glue       | 5         | piece  |
| Chips      | 10        | piece  |
| Drinks     | 20        | piece  |

---

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A terminal / command prompt

### Installation & Run

```bash
# 1. Clone the repository
git clone https://github.com/your-username/bill-generator.git

# 2. Navigate to the project directory
cd bill-generator

# 3. Compile the Java file
javac BillGenerator.java

# 4. Run the program
java BillGenerator
```

---

## 🖥️ Sample Output

```
-------------------------
  WELCOME TO XYZ STORE
-------------------------
ITEMS LIST
    ITEM       PRICE
    EGG      : 5
    NOTEBOOK : 30
    ...

 ENTER 1 ITEM NAME : milk
 ENTER ITEM QUANTITY : 2

 TO CONTINUE THE SHOPPING PLEASE ENTER 1 ELSE ENTER 0
0

-------------------------
CUSTOMER ITEMS LIST
-------------------------
ITEM          QUANTITY
MILK        : 2

---------------
 TOTAL COST
---------------
110.0
---------------
 WITH GST 18%
---------------
129.8
 CHRISTMAS LUCKY DRAW OFFER UPTO 20% OFF
 TO PARTICIPATE IN THIS LUCKY DRAW ENTER 1 ELSE ENTER 0
1
 CONGRATULATIONS YOU GOT 15% DISCOUNT
 AFTER 15% OF DISCOUNT TOTAL
110.33
```

---

## 🧠 Concepts Used

| Concept              | Usage                                      |
|----------------------|--------------------------------------------|
| `Scanner`            | Reading user input from console            |
| `Random`             | Generating lucky draw discount percentage  |
| `switch-case`        | Mapping item names to prices               |
| `while` loop         | Continuing shopping until user exits       |
| `for` loop           | Accumulating cost per quantity             |
| `static` methods     | `customer_order_list()` and `total()`      |
| `String` operations  | Formatting bill output with alignment      |
| `toUpperCase()`      | Case-insensitive item name matching        |

---

## 📁 Project Structure

```
bill-generator/
│
├── BillGenerator.java    # Main source file
└── README.md             # Project documentation
```

---

## 🔮 Future Improvements

- [ ] Add price per unit display in the final bill
- [ ] Support decimal quantities (e.g., 0.5 litres of milk)
- [ ] Save bill to a `.txt` file
- [ ] Add more items to the inventory
- [ ] Implement item-not-found retry instead of skipping
- [ ] Add a GUI using Java Swing

---

## 👨‍💻 Author

**Dasari Muralidhar**
- GitHub: [@muralidhar24](https://github.com/muralidhar24)
- This is my **Project #2** — learning Java one project at a time! 🚀

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

> *"Every expert was once a beginner."* — Keep coding! 💻
