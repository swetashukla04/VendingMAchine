package item;

public class ItemShelf {

    private int itemCode;
    private Item item;
    private boolean soldOut;

    public int getItemCode() {
        return itemCode;
    }

    public Item getItem() {
        return item;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }
    

}
