package at.lornaslane.vocabapp;

public class Account {
    int accountNumber;
    String userName;

    Account(int pAccountNumber, String pUserName) {

        this.accountNumber = pAccountNumber;
        this.userName = pUserName;

        pUserName = "Lorna";
        pAccountNumber = 12345;

    }
}
