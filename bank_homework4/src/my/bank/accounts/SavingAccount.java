package my.bank.accounts;

import my.bank.errors.SavingAccountExceedLimitException;

public class SavingAccount extends CurrentAccount {
    private double limit;

    public SavingAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public double withdraw(double amount) throws SavingAccountExceedLimitException{
        if (balance - amount < limit)
            throw new SavingAccountExceedLimitException();
        balance -= amount;
        return amount;

    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
