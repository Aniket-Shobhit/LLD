package State.impl;

import Machine.Coin;
import Machine.Item;
import Machine.VendingMachine;
import State.State;

import java.util.ArrayList;
import java.util.List;

public class SelectionState implements State {
    public SelectionState() {
        System.out.println("Currently Machine is in Selection State!");
    }

    public SelectionState(VendingMachine machine) {
        System.out.println("Currently Machine is in Selection State!");
    }

    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception  {
        throw new Exception("Insert Coin Button cannot be clicked in Has Money State!");
    }

    public void clickOnStartProductSelectionButton(VendingMachine machine) {
        return;
    }

    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Coins cannot be inserted in Idle State");
    }

    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        Item item = machine.getInventory().getItem(codeNumber);

        int paidByUser = 0;
        for(Coin coin: machine.getCoinList()) {
            paidByUser += coin.value;
        }

        int change = paidByUser - item.getPrice();
        if(change < 0) {
            System.out.println("Cannot select this product, amount paid by you="+paidByUser+" and price of product="+item.getPrice());
            getFullRefund(machine);
            throw new Exception("Cannot select this product due to insufficient payment!");
        }
        else {
            if(change != 0) {
                getChange(machine, change);
            }
            machine.setVendingMachineState(new DispenseState(machine,codeNumber));
        }
    }

    public int getChange(VendingMachine machine, int change) {
        System.out.println("Returned the change in the Coin Dispense Tray : " + change);
        return change;
    }

    public List<Coin> getFullRefund(VendingMachine machine) {
        System.out.println("Complete money has been returned to the Coin Change Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product cannot be dispensed in Idle State");
    }

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }

}
