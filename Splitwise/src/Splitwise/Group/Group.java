package Splitwise.Group;

import Splitwise.Expense.*;
import Splitwise.User.*;
import java.util.*;

public class Group {
    public int id;
    String name;
    public List<User> users;
    List<Expense> expenseList;
    public Map<User, Integer> userBalanceMap;
    ExpenseController expenseController;
    Boolean isSettled;

    Group(int id, String name) {
        System.out.println("Group constructor called");
        this.id = id;
        this.name = name;
        this.users = new ArrayList<>();
        this.expenseList = new ArrayList<>();
        this.userBalanceMap = new HashMap<>();
        this.expenseController = new ExpenseController();
        this.isSettled = false;
    }

    public void addUser(User user) {
        this.users.add(user);
        this.userBalanceMap.put(user, 0);
    }

    public Expense createExpense(int id, String description, User user, int moneySpent, List<User> userList, ExpenseTypeEnum expenseType, List<Integer> moneyOwed) {
        Expense expense = expenseController.createExpense(id, description, user, moneySpent, userList, expenseType, moneyOwed);
        expenseList.add(expense);
        for (int i = 0; i < expense.userList.size(); i++) {
            User user1 = expense.userList.get(i);
            int moneyOwed1 = expense.moneyOwed.get(i);
            userBalanceMap.put(user1, userBalanceMap.get(user1) + moneyOwed1);
        }
        userBalanceMap.put(expense.user, userBalanceMap.get(expense.user) - expense.moneySpent);
        return expense;
    }

    public void showGroupExpense() {
        for (Expense expense : expenseList) {
            expense.showExpense();
        }
    }

}
