package vending_machine;

import vending_machine.state.impl.OutOfStockState;
import vending_machine.state.State;
import vending_machine.state.impl.ReadyState;

// Context class: VendingMachine
public class VendingMachine {
    private State currentState;
    private int itemCount;

    public VendingMachine(int itemCount) {
        this.itemCount = itemCount;
        if (itemCount > 0) {
            currentState = new ReadyState();
        } else {
            currentState = new OutOfStockState();
        }
    }

    public void insertCoin() {
        currentState.insertCoin(this);
    }

    public void selectProduct() {
        currentState.selectProduct(this);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct(this);
    }

    public void setState(State newState) {
        currentState = newState;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
