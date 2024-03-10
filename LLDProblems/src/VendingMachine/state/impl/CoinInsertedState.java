package VendingMachine.state.impl;

import VendingMachine.VendingMachine;
import VendingMachine.state.State;

public class CoinInsertedState implements State {
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("coin inserted : Rs." + amount);
        vendingMachine.addBalance(amount);
        vendingMachine.setState(new CoinInsertedState()); // changes state to coin inserted state
    }

    public void selectProduct(VendingMachine vendingMachine, String code) {
        System.out.println("Product selected with code : " + code);
        vendingMachine.setState(new DispensingState());
    }

    public void dispenseProduct(VendingMachine vendingMachine, String code) {
        System.out.println("Please select a product first");
    }
}