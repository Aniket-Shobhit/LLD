package Machine;

public class ItemShelf {
    Item item;
    int codeNumber;
    boolean soldOut;

    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }

    public int getCodeNumber() {
        return codeNumber;
    }
    public void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    public boolean getSoldOut() {
        return soldOut;
    }
    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }
}
