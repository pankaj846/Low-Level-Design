package VendingMachine.state.impl;

import VendingMachine.VendingMachine;
import VendingMachine.state.State;
import VendingMachine.Item;

import java.util.Map;

public class DispensingState implements State {
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Please wait, product dispensing");
    }

    public void selectProduct(VendingMachine vendingMachine, String code) {
        System.out.println("Please wait, product dispensing");
    }

    public void dispenseProduct(VendingMachine vendingMachine, String code) {

        int currentItemCount = vendingMachine.getItemCount();

        // if vending machine has item
        if (currentItemCount > 0) {
            Item item = vendingMachine.getItems().get(code);

            if(item==null) {
                System.out.println("Invalid code, please try again");
            }

            // have enough money
            else if(item.getPrice() <= vendingMachine.getBalance()){
                System.out.println("Product dispensed : " + item.getName());
                vendingMachine.setState(new ReadyState());
                vendingMachine.setItemCount(currentItemCount - 1);
                vendingMachine.setBalance(0);
            }

            // don't have enough money
            else{
                System.out.println("Insufficient money, Please add more");
                vendingMachine.setState(new ReadyState());
            }
        }

        else {
            vendingMachine.setState(new OutOfStockState());
        }
    }
}
