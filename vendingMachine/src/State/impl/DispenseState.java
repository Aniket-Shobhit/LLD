package State.impl;

import Machine.Coin;
import Machine.Item;
import Machine.VendingMachine;
import State.State;

import java.util.ArrayList;
import java.util.List;

public class DispenseState implements State {

    public DispenseState() {
        System.out.println("Currently Machine is in Dispense State!");
    }

    public DispenseState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Currently Machine is in Dispense State!");
        dispenseProduct(machine, codeNumber);
    }

    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception  {
        throw new Exception("Insert Coin Button cannot be clicked in Dispense State!");
    }

    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("Product Selection cannot be clicked in Dispense State");
    }

    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Coins cannot be inserted in Dispense State");
    }

    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product cannot be chosen in Idle State");
    }

    public int getChange(VendingMachine machine, int change) throws Exception {
        throw new Exception("Change cannot be returned in Idle State");
    }

    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Selected product has been put in the Product Tray!");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    public List<Coin> getFullRefund(VendingMachine machine) throws Exception {
        throw new Exception("Refund cannnot be initiated in Idle State");
    }

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }
}
