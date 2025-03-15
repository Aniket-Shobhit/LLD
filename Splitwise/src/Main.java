import Splitwise.User.UserController;
import Splitwise.User.User;
import Splitwise.Group.Group;
import Splitwise.Expense.Expense;
import Splitwise.Expense.ExpenseTypeEnum;
import Splitwise.Group.GroupController;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        UserController userController = new UserController();
        User aniket = userController.addUser(1, "aniket");
        User rahul = userController.addUser(2, "rahul");
        User shubham = userController.addUser(3, "shubham");
        User shivam = userController.addUser(4, "shivam");

        GroupController groupController = new GroupController();
        Group trip = groupController.addGroup(1, "Trip");
        trip.addUser(aniket);
        trip.addUser(rahul);
        trip.addUser(shubham);
        trip.addUser(shivam);

        List<User> userList = new ArrayList<>();
        userList.add(aniket);
        userList.add(rahul);
        userList.add(shubham);
        userList.add(shivam);

        List <Integer> moneyOwed = new ArrayList<>();

        Expense hotelExpense = trip.createExpense(1, "Hotel Booking", aniket, 1000, userList, ExpenseTypeEnum.EQUAL, new ArrayList<>());
//        hotelExpense.showExpense();

        userList = new ArrayList<>();
        userList.add(rahul);
        userList.add(shubham);

        moneyOwed = new ArrayList<>();
        moneyOwed.add(550);
        moneyOwed.add(200);

        // Expense shoppingExpense = trip.createExpense(2, "Online Shopping", aniket, 750, userList, ExpenseTypeEnum.EXACT, moneyOwed);
//        shoppingExpense.showExpense();

        userList = new ArrayList<>();
        userList.add(aniket);
        userList.add(rahul);

        moneyOwed = new ArrayList<>();
        moneyOwed.add(70);
        moneyOwed.add(30);

        // Expense foodExpense = trip.createExpense(3, "Food", shubham, 800, userList, ExpenseTypeEnum.PERCENT, moneyOwed);
//
        userList = new ArrayList<>();
        userList.add(shivam);
        userList.add(shubham);

        // Expense cabExpense = trip.createExpense(4, "Cab", aniket, 500, userList, ExpenseTypeEnum.EQUAL, new ArrayList<>());

        groupController.settleExpense(1);
    }
}