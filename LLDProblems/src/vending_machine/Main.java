package vending_machine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(2);
        vendingMachine.selectProduct(); // Output: Please insert coins first

        vendingMachine.insertCoin(); // Output: Coin inserted
        vendingMachine.selectProduct(); // Product selected
        vendingMachine.dispenseProduct(); // Product dispensed

        vendingMachine.insertCoin(); // Output: Coin inserted
        vendingMachine.selectProduct(); // Product selected
        vendingMachine.dispenseProduct(); // Product dispensed

        System.out.println(vendingMachine.getItemCount()); // 0

        vendingMachine.insertCoin(); // out of stock
        vendingMachine.selectProduct(); // out of stock
        vendingMachine.dispenseProduct(); // out of stock

    }
}