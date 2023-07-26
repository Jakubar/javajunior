package my.bank.accounts;

import my.bank.errors.SavingAccountExceedLimitException;

public class CurrentAccount implements Account {
    protected String accountNumber;
    protected double balance;

    public CurrentAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double withdraw(double amount) throws SavingAccountExceedLimitException {
        balance -= amount;
        return amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
