package Machine;

import State.State;
import java.util.List;

public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }
    public void setVendingMachineState(State state) {
        this.vendingMachineState = state;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }
    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }
}
