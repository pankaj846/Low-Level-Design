package vending_machine.state;

import vending_machine.VendingMachine;

// State interface
public interface State {
    void insertCoin(VendingMachine vendingMachine);

    void selectProduct(VendingMachine vendingMachine);

    void dispenseProduct(VendingMachine vendingMachine);
}