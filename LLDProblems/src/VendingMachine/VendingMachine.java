package VendingMachine;

import VendingMachine.state.impl.OutOfStockState;
import VendingMachine.state.State;
import VendingMachine.state.impl.ReadyState;

import java.util.HashMap;
import java.util.Map;

// Context class: VendingMachine
public class VendingMachine {

    // reference of State, can achieve behaviour of implemented classes
    private State currentState;

    Map<String, Item> items; // code => Item
    private int itemCount;
    private double balance;

    public VendingMachine() {

        this.balance = 0;
        items = new HashMap<>();
        this.itemCount = 3;

        // hard coded items
        items.put("290", new Item("Pepsi", 80));
        items.put("108", new Item("Chips", 20));
        items.put("60", new Item("Biscuit", 40));

        // initial state is readyState
        currentState = new ReadyState();
    }

    // These are the behaviour of vending machine
    // insert coin => select product => dispense product
    public void insertCoin(int amount) {
        currentState.insertCoin(this, amount);
    }

    public void selectProduct(String code) {
        currentState.selectProduct(this, code);
    }

    public void dispenseProduct(String code) {
        currentState.dispenseProduct(this, code);
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(int bal) {
        this.balance = bal;
    }

    public void addBalance(double balance) {
        this.balance += balance;
    }

    public Map<String, Item> getItems() {
        return items;
    }

}
