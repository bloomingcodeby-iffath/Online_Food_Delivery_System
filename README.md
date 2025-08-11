# 🍔 Online Food Delivery System (Java OOP)

A simple Java object-oriented project modeling an online food delivery system.  
Demonstrates encapsulation, inheritance, interfaces, abstraction, custom exceptions, and a basic wallet/payments flow.

## ✨ Features
- Encapsulation: all fields are private with getters/setters
- Polymorphism & Inheritance: `FoodItem` → `Beverage`
- Interface: `Orderable` for placing/cancelling orders
- Overloading: `currentPrice()` and `currentPrice(String offerName)`
- Custom exceptions: `LowPriceException`, `InsufficientFundsException`
- **User & Wallet**:
  - Store user info (id, name, phone)
  - Payment gating: orders only successful if wallet has enough balance


---
