package vending_machine.state.impl;

import vending_machine.VendingMachine;
import vending_machine.state.State;

public class OutOfStockState implements State {
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Out of stock");
    }

    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Out of stock");
    }

    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Out of stock");
    }
}