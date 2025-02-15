package State.impl;

import Machine.Coin;
import Machine.Item;
import Machine.VendingMachine;
import State.State;

import java.util.List;

public class HasMoneyState implements State {
    public HasMoneyState() {
        System.out.println("Currently Machine is in Has Money State!");
    }

    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception  {
        return;
    }

    public void clickOnStartProductSelectionButton(VendingMachine machine) {
        machine.setVendingMachineState(new SelectionState(machine));
    }

    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("Accepted the coin!");
        machine.getCoinList().add(coin);
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

    public List<Coin> getFullRefund(VendingMachine machine) {
        System.out.println("Returned the full amount of money back in the Coin Dispence Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Cannot update Inventory in Has Money State");
    }

}
