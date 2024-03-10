package ATMMachine.impl;

import ATMMachine.ATMMachine;
import ATMMachine.ATMState;

public class IdealState implements ATMState {

    @Override
    public void insertCard(ATMMachine atmMachine) {
        System.out.println("Card has been inserted and state changes to HasCardState");
        atmMachine.setState(new cardInsertedState());
    }

    @Override
    public void ejectCard(ATMMachine atmMachine) {
        System.out.println("Please first insert the card");
    }

    @Override
    public void enterPin(ATMMachine atmMachine, String pincode) {
        System.out.println("Please first insert the card");
    }

    @Override
    public void withdrawCash(ATMMachine atmMachine, int amount) {
        System.out.println("Please first insert the card");
    }
}
