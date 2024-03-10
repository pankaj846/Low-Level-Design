package VendingMachine;

public class Main {
    public static void main(String[] args) {

//        items.put("290", new Item("Pepsi", 80));
//        items.put("108", new Item("Chips", 20));
//        items.put("60", new Item("Biscuit", 40));

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.selectProduct("290"); // Output: Please insert coins first

        vendingMachine.insertCoin(80); // Output: Coin inserted: Rs.80
        vendingMachine.selectProduct("290"); // Product selected with code: 290
        vendingMachine.dispenseProduct("290"); // Product dispensed : Pepsi

        vendingMachine.insertCoin(40); // Output: coin inserted : Rs.40
        vendingMachine.selectProduct("601"); // Product selected with code : 601
        vendingMachine.dispenseProduct("601"); // Invalid code, please try again
        vendingMachine.dispenseProduct("60"); // Product dispensed : Biscuit


        System.out.println(vendingMachine.getItemCount()); // 1

        vendingMachine.insertCoin(10); // coin inserted : Rs.10
        vendingMachine.selectProduct("108"); // Product selected with code : 108
        vendingMachine.dispenseProduct("108"); // Insufficient money, Please add more
        vendingMachine.insertCoin(10);//  coin inserted : Rs.10
        vendingMachine.selectProduct("108"); // Product selected with code : 108
        vendingMachine.dispenseProduct("108"); // Product dispensed : Chips

        vendingMachine.insertCoin(10); // coin inserted : Rs.10
        vendingMachine.selectProduct("108"); // Product selected with code : 108
        vendingMachine.dispenseProduct("108"); // out of stock
        vendingMachine.insertCoin(10);// out of stock
        vendingMachine.selectProduct("108"); // out of stock
        vendingMachine.dispenseProduct("108"); // out of stock

    }
}