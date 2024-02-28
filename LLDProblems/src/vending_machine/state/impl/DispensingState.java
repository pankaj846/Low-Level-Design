package vending_machine.state.impl;

import vending_machine.VendingMachine;
import vending_machine.state.State;

public class DispensingState implements State {
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Please wait, product dispensing");
    }

    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Please wait, product dispensing");
    }

    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Product dispensed");
        int currentItemCount = vendingMachine.getItemCount();
        if (currentItemCount > 0) {
            vendingMachine.setItemCount(currentItemCount - 1);
            if (currentItemCount - 1 == 0) {
                vendingMachine.setState(new OutOfStockState());
            } else {
                vendingMachine.setState(new ReadyState());
            }
        } else {
            vendingMachine.setState(new OutOfStockState());
        }
    }
}
