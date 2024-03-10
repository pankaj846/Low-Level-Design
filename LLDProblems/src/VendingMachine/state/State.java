package VendingMachine.state;

import VendingMachine.VendingMachine;
import VendingMachine.Item;

import java.util.Map;

// State interface
public interface State {
   void insertCoin(VendingMachine vendingMachine, int amount);

    void selectProduct(VendingMachine vendingMachine, String code);

    void dispenseProduct(VendingMachine vendingMachine, String code);
}

// We have these operation in vending machine
// 1. insert coin => 2. select product => 3. dispense product

// flow of state
// ReadyState(Ideal) => CoinInsertedState => DispensingState => outOfStock