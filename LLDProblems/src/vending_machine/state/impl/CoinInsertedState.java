package vending_machine.state.impl;

import vending_machine.VendingMachine;
import vending_machine.state.State;

public class CoinInsertedState implements State {
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Coin already inserted");
    }

    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Product selected");
        vendingMachine.setState(new DispensingState());
    }

    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Please select a product first");
    }
}