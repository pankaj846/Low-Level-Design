package ATMMachine;

import ATMMachine.impl.IdealState;
import ATMMachine.impl.cardInsertedState;

// context class: ATM Machine
public class ATMMachine {
    ATMState currentState;

    ATMMachine(){
        System.out.println("ATM machine initial state is IdealState");
        currentState = new IdealState();
    }

    public void setState(ATMState currentState){
        this.currentState = currentState;
    }

    public void insertCard(){
        currentState.insertCard(this);
    }

    public void ejectCard(){
        currentState.ejectCard(this);
    }

    public void enterPin(String pincode){
        currentState.enterPin(this, pincode);
    }

    public void withdrawCash(int amount){
        currentState.withdrawCash(this, amount);
    }

}
