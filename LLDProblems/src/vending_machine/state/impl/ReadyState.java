package vending_machine.state.impl;

import vending_machine.VendingMachine;
import vending_machine.state.State;
import vending_machine.state.impl.CoinInsertedState;

// Concrete state classes
public class ReadyState implements State {
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Coin inserted");
        vendingMachine.setState(new CoinInsertedState());
    }

    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Please insert coin first");
    }

    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Please insert coin first");
    }
}
