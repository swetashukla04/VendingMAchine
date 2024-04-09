package vendingmachine;

import java.util.ArrayList;
import java.util.List;

import coin.Coin;
import inventory.Inventory;

public class VendingMachine {

    private VendingMachineState vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine(){
        vendingMachineState =new VendingMachineState();
        inventory=new Inventory(10);
        coinList=new ArrayList<>();

    }

    public VendingMachineState getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    
}
