package ATMMachine.impl;

import ATMMachine.ATMMachine;
import ATMMachine.ATMState;

public class withdrawState implements ATMState {

    @Override
    public void insertCard(ATMMachine atmMachine) {
        System.out.println("Card already inserted");
    }

    @Override
    public void ejectCard(ATMMachine atmMachine) {
        System.out.println("Card has been ejected and state changes to Ideal");
        atmMachine.setState(new IdealState());
    }

    @Override
    public void enterPin(ATMMachine atmMachine, String pincode) {
        System.out.println("Pin already entered");
    }

    @Override
    public void withdrawCash(ATMMachine atmMachine, int amount) {
        // implement logic of withdraw
        System.out.println("Cash has been withdraw");
    }
}
