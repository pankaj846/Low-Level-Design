package VendingMachine.state.impl;

import VendingMachine.VendingMachine;
import VendingMachine.state.State;
import VendingMachine.Item;

import java.util.Map;

public class OutOfStockState implements State {
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Out of stock");
    }

    public void selectProduct(VendingMachine vendingMachine, String code) {
        System.out.println("Out of stock");
    }

    public void dispenseProduct(VendingMachine vendingMachine, String code) {
        System.out.println("Out of stock");
    }
}