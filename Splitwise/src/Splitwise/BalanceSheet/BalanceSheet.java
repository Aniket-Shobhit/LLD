package Splitwise.BalanceSheet;

import Splitwise.User.User;
import java.util.Map;
import java.util.HashMap;

public class BalanceSheet {
    Map<User, Integer> userBalanceMap;

    int totalExpense;
    int totalOwed;
    int totalGetBack;

    BalanceSheet() {
        this.userBalanceMap = new HashMap<>();
        this.totalExpense = 0;
        this.totalOwed = 0;
        this.totalGetBack = 0;
    }

}