package at.lornaslane.vocabapp;

public class Account {
    private int accountNumber;
    private String userName;

    Account(int pAccountNumber, String pUserName) {

        this.accountNumber = pAccountNumber;
        this.userName = pUserName;

        pUserName = "Lorna";
        pAccountNumber = 12345;

    }
}
