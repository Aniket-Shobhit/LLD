package State.impl;

import Machine.Coin;
import Machine.Item;
import Machine.VendingMachine;
import State.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Currently Machine is in Idle State!");
    }

    public IdleState(VendingMachine machine) {
        System.out.println("Currently Machine is in Idle State!");
        machine.setCoinList(new ArrayList<Coin>());
    }

    public void clickOnInsertCoinButton(VendingMachine machine)  {
        machine.setVendingMachineState(new HasMoneyState());
    }

    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("Product Selection cannot be clicked in Idle State");
    }

    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Coins cannot be inserted in Idle State");
    }

    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product cannot be chosen in Idle State");
    }

    public int getChange(VendingMachine machine, int change) throws Exception {
        throw new Exception("Change cannot be returned in Idle State");
    }

    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product cannot be dispensed in Idle State");
    }

    public List<Coin> getFullRefund(VendingMachine machine) throws Exception {
        throw new Exception("Refund cannnot be initiated in Idle State");
    }

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }

}
