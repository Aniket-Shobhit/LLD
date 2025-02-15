package Splitwise.Expense ;

import Splitwise.User.*;
import java.util.List;

public class Expense {
    int id;
    public User user;
    String description;
    public int moneySpent;
    ExpenseTypeEnum expenseType;
    public List<User> userList;
    public List<Integer> moneyOwed;

    Expense(int id, String description, User user, int moneySpent, List<User> userList, ExpenseTypeEnum expenseType, List<Integer> moneyOwed) {
        this.id = id;
        this.description = description;
        this.user = user;
        this.moneySpent = moneySpent;
        this.userList = userList;
        this.expenseType = expenseType;
        this.moneyOwed = moneyOwed;
    }

    public void showExpense() {
        System.out.println("Expense ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Paid By User: " + user.getName());
        System.out.println("Users Involved: ");
        for (User user : userList) {
            System.out.println(user.getName());
        }
        System.out.println("Money Spent: " + moneySpent);
        System.out.println("Expense Type: " + expenseType);
        System.out.println("Money Owed: ");
        for (int i = 0; i < userList.size(); i++) {
            if(userList.get(i).id == user.id) {
                continue;
            }
            System.out.println(userList.get(i).getName() + ": " + moneyOwed.get(i));
        }
    }

}
