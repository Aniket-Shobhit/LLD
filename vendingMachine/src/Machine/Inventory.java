package Machine;

import java.util.List;

public class Inventory {
    ItemShelf[] inventory = null;

    Inventory(int itemCount) {
        inventory = new ItemShelf[itemCount];
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public ItemShelf[] initialEmptyInventory() {
        int code = 101;
        for(int i=0;i<inventory.length;i++) {
            ItemShelf itemSpace = new ItemShelf();
            itemSpace.setSoldOut(true);
            itemSpace.setCodeNumber(code);
            inventory[i] = itemSpace;
        }
        return inventory;
    }

    public void addItem(Item item, int codeNumber) throws Exception{
        for(ItemShelf itemShelf: inventory) {
            if(itemShelf.codeNumber == codeNumber) {
                if(itemShelf.soldOut) {
                    itemShelf.setSoldOut(false);
                }
                else {
                    throw new Exception("Item already present, cannot add another item!");
                }
            }
        }
    }

    public Item getItem(int codeNumber) throws Exception {
        for(ItemShelf itemShelf: inventory) {
            if(itemShelf.codeNumber == codeNumber) {
                if(itemShelf.soldOut) {
                    throw new Exception("Item already sold out!");
                }
                else {
                    return itemShelf.item;
                }
            }
        }
        throw new Exception("Invalid code!");
    }

    public void updateSoldItem(int codeNumber) {
        for(ItemShelf itemShelf: inventory) {
            if(itemShelf.codeNumber == codeNumber) {
                itemShelf.setSoldOut(true);
            }
        }
    }

}

