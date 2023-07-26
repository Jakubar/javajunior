package my.bank.accounts;
import my.bank.errors.AccountNumberNotFoundException;
import my.bank.errors.SavingAccountExceedLimitException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();

    public Bank(){
    }

    public void addAccount (Account account){
        accounts.add(account);
    }

    public void removeAccount (Account account){
        accounts.remove(account);
    }

    public double withdraw (String accountNumber, double amount) throws AccountNumberNotFoundException {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber)
                try {
                    return account.withdraw(amount);
                } catch (SavingAccountExceedLimitException e){
                    throw new RuntimeException(e);
                }

        }

        throw new AccountNumberNotFoundException(accountNumber + ": account number does not exist.");

    }

    public void getAccountBalance(){

    }
}

