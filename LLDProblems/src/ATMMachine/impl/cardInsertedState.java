package ATMMachine.impl;

import ATMMachine.ATMMachine;
import ATMMachine.ATMState;

public class cardInsertedState implements ATMState {

    @Override
    public void insertCard(ATMMachine atmMachine) {
        System.out.println("Card is already insereted");
    }

    @Override
    public void ejectCard(ATMMachine atmMachine) {
        System.out.println("Card has been ejected and state changes to Ideal");
        atmMachine.setState(new IdealState());
    }

    @Override
    public void enterPin(ATMMachine atmMachine, String pincode) {
        System.out.println("Pin has been entered and state changes to withdrawState");
        atmMachine.setState(new withdrawState());
    }

    @Override
    public void withdrawCash(ATMMachine atmMachine, int amount) {
        System.out.println("Please first enter the PIN");
    }
}
