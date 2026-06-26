# Banking Application

A simple Java banking application demonstrating object-oriented programming concepts with account management functionality.

## Project Overview

This is a basic banking system that allows users to perform common banking operations like deposits and withdrawals on savings accounts.

## Project Structure
├── Account.java          # Abstract base class for all account types
├── SavingsAccount.java   # Concrete implementation of a savings account
├── BankingApp.java       # Main application entry point
└── README.md             # This file

## Classes

### Account (Abstract)
The base class that defines the structure and common functionality for all account types.

**Fields:**
- `accountNumber`
- `accountHolder`
- `balance`

**Methods:**
- `Account()`
- `deposit(double amount)`
- `withdraw(double amount)`
- `displayAccountDetails()`

### SavingsAccount
A concrete implementation of the Account class for savings accounts.

**Methods:**
- `SavingsAccount()`
- `withdraw(double amount)`

## Features

- Create savings accounts with initial balance
- Deposit money into accounts
- Withdraw money with insufficient balance protection
- View account details

## Usage

```bash
javac *.java
java BankingApp
Requirements
Java 8 or higher
JDK installed and configured
