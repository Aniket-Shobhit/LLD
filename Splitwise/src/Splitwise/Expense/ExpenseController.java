package Splitwise.Expense;
import Splitwise.User.User;
import java.util.List;

public class ExpenseController {

    public Expense createExpense(int id, String description, User user, int moneySpent, List<User> userList, ExpenseTypeEnum expenseType, List<Integer> moneyOwed) {
        if (expenseType == ExpenseTypeEnum.EQUAL) {
            int moneyOwedPerUser = moneySpent / userList.size();
            for (int i = 0; i < userList.size(); i++) {
                moneyOwed.add(moneyOwedPerUser);
            }
        }
        else if(expenseType == ExpenseTypeEnum.PERCENT) {
            System.out.println("hello");
            for (int i = 0; i < moneyOwed.size(); i++) {
                moneyOwed.set(i, (moneySpent * moneyOwed.get(i)) / 100);
            }
        }
        System.out.println("outside");

        Expense expense = new Expense(id, description, user, moneySpent, userList, expenseType, moneyOwed);
        return expense;
    }

}
