package my.bank;

import my.bank.accounts.Bank;
import my.bank.accounts.CurrentAccount;
import my.bank.accounts.SavingAccount;
import my.bank.errors.AccountNumberNotFoundException;
import my.bank.errors.SavingAccountExceedLimitException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        CurrentAccount currentAccount1 = new CurrentAccount("4001");
        SavingAccount savingAccount1 = new SavingAccount("0001");
        savingAccount1.setLimit(1000);
        bank.addAccount(currentAccount1);
        bank.addAccount(savingAccount1);

        try {
            double amount = bank.withdraw("0001", 20);
            System.out.println(amount + " zł withdrawn from acoount.");
        } catch (AccountNumberNotFoundException e){
            System.out.println("Cannot withdraw - account does not exist");
        }
//        catch (SavingAccountExceedLimitException e){
//            System.out.println("Cannot withdraw - exceeded limit");
//        }
    }
}