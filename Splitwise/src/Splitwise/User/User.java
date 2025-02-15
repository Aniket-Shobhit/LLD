package Splitwise.User;

import Splitwise.BalanceSheet.BalanceSheet;

public class User {
    public int id;
    String name;
    BalanceSheet balanceSheet;


    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BalanceSheet getBalanceSheet() {
        return balanceSheet;
    }
}
