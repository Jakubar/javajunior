package my.bank.errors;

public class AccountNumberNotFoundException extends  Exception {
    public AccountNumberNotFoundException() {
    }

    public AccountNumberNotFoundException(String message) {
        super(message);
    }
}
