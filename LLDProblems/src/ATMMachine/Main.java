package ATMMachine;

public class Main {

    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();
        atmMachine.withdrawCash(500);

        atmMachine.insertCard();
        atmMachine.enterPin("2455");
        atmMachine.withdrawCash(24333);
        atmMachine.ejectCard();

    }

}
