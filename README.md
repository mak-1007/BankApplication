# 💰 Bank Management System (Java OOP)

A simple **Bank Management System** built using **Java** to demonstrate core **Object-Oriented Programming (OOP)** concepts such as **interfaces, abstraction, encapsulation, and polymorphism**.

This project simulates basic banking operations like account creation, balance checking, deposits, withdrawals, password management, and interest calculation.

---

## 🚀 Features

* 🏦 Create bank accounts (SBI, HDFC)
* 💵 Deposit money
* 💸 Withdraw money
* 🔐 Change account password
* 📊 Check account balance
* 📈 Calculate interest

---

## 🧠 Concepts Used

* **Interface** → `BankInterface`
* **Classes** → `SBI`, `HDFC`
* **Encapsulation** → Private variables
* **Abstraction** → Interface implementation
* **Polymorphism** → Multiple bank implementations
* **UUID** → Unique account number generation

---

## 📁 Project Structure

```
bank.application
│
├── BankInterface.java   // Interface with all banking operations
├── SBI.java             // SBI bank implementation
├── HDFC.java            // HDFC bank implementation
├── Main.java            // Entry point (driver code)
```

---

## 🛠️ Methods Overview

### 🔹 BankInterface

```java
int checkBalance(String password);
String addMoney(int money);
String withDrawMoney(int amount, String password);
int changePassword(String old_password, String new_password);
double calculateIntrest(int years, String password);
```

---

## ▶️ How to Run

1. Clone the repository:

```
git clone https://github.com/your-username/your-repo-name.git
```

2. Open project in **IntelliJ IDEA / Eclipse**

3. Navigate to:

```
src/bank/application/Main.java
```

4. Run the `Main` class

---

## 🧪 Sample Usage

```java
SBI acc1 = new SBI(10000, "123", "Aman");

acc1.checkBalance("123");
acc1.addMoney(3000);
acc1.withDrawMoney(2000, "123");
acc1.changePassword("123", "321");
acc1.calculateIntrest(2, "321");
```

---

## ⚠️ Known Issues / Improvements Needed

* ❌ String comparison using `==` instead of `.equals()`
* ❌ Some methods return default values (not fully implemented)
* ❌ Password validation missing in some methods
* ❌ HDFC constructor has incorrect parameter usage
* ❌ Methods returning empty strings instead of meaningful responses
* ❌ No input validation or exception handling

---

## 🔧 Suggested Improvements

* Use `.equals()` for String comparison
* Return proper messages instead of empty strings
* Implement all methods fully
* Add exception handling
* Create a menu-driven system using `Scanner`
* Improve code structure and readability

---

## 🚀 Future Enhancements

* 🎨 GUI using Java Swing / JavaFX
* 🗄️ Database integration (MySQL)
* 🔐 Login & authentication system
* 📜 Transaction history
* 🌐 REST API using Spring Boot

---

## 👨‍💻 Author

**Aman**
B.Tech CSE | Java Developer

---

## ⭐ Support

If you found this project helpful, please ⭐ star the repository and feel free to contribute!
