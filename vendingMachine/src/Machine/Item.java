package Machine;

public class Item {
    ItemType type;
    int price;

    public ItemType getItem() {
        return type;
    }
    public void setItem(ItemType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
