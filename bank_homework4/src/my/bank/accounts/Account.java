package my.bank.accounts;

import my.bank.errors.SavingAccountExceedLimitException;

interface Account {
    void deposit(double amount);
    double withdraw(double amount) throws SavingAccountExceedLimitException;
    double getBalance();

    String getAccountNumber();
}