package Splitwise.Group;

import java.util.*;
import Splitwise.User.*;

public class GroupController {
    List<Group> groupList;

    public GroupController() {
        groupList = new ArrayList<>();
    }

    public Group addGroup(int id, String name) {
        Group newGroup = new Group(id, name);
        groupList.add(newGroup);
        return newGroup;
    }

    public Group getGroup(int id) {
        for (Group group : groupList) {
            if (group.id == id) {
                return group;
            }
        }
        return null;
    }


    public void showUsers(int id) {
        Group group = getGroup(id);
        if (group == null) {
            System.out.println("Group not found");
            return;
        }
        for (int i = 0; i < group.users.size(); i++) {
            System.out.println(group.users.get(i).getName());
        }
    }

    public void settleExpense(int id) {

        Group group = getGroup(id);

        if (group == null) {
            System.out.println("Group not found");
            return;
        }

        System.out.println("Balance Sheet");
        for (Map.Entry<User, Integer> entry : group.userBalanceMap.entrySet()) {
            System.out.println(entry.getKey().getName() + " " + entry.getValue());
        }

        for (Map.Entry<User, Integer> entry : group.userBalanceMap.entrySet()) {
            PriorityQueue<User> maxHeap = new PriorityQueue<>(new Comparator<User>() {
                @Override
                public int compare(User o1, User o2) {
                    return group.userBalanceMap.get(o2) - group.userBalanceMap.get(o1);
                }
            });
            PriorityQueue<User> minHeap = new PriorityQueue<>(new Comparator<User>() {
                @Override
                public int compare(User o1, User o2) {
                    return group.userBalanceMap.get(o1) - group.userBalanceMap.get(o2);
                }
            });

            for (Map.Entry<User, Integer> entry1 : group.userBalanceMap.entrySet()) {
                if (entry1.getValue() > 0) {
                    maxHeap.add(entry1.getKey());
                } else if (entry1.getValue() < 0) {
                    minHeap.add(entry1.getKey());
                }
            }

            while (!maxHeap.isEmpty() && !minHeap.isEmpty()) {
                User maxUser = maxHeap.poll();
                User minUser = minHeap.poll();
                int amount = Math.min(group.userBalanceMap.get(maxUser), Math.abs(group.userBalanceMap.get(minUser)));
                group.userBalanceMap.put(maxUser, group.userBalanceMap.get(maxUser) - amount);
                group.userBalanceMap.put(minUser, group.userBalanceMap.get(minUser) + amount);
                if (group.userBalanceMap.get(maxUser) != 0) {
                    maxHeap.add(maxUser);
                }
                if (group.userBalanceMap.get(minUser) != 0) {
                    minHeap.add(minUser);
                }
                System.out.println(maxUser.getName() + " pays " + amount + " to " + minUser.getName());
            }
        }
        group.isSettled = true;
    }
}
