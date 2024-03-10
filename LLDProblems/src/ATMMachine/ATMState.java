package ATMMachine;

public interface ATMState {
    void insertCard(ATMMachine atmMachine);
    void ejectCard(ATMMachine atmMachine);
    void enterPin(ATMMachine atmMachine, String pincode);
    void withdrawCash(ATMMachine atmMachine, int amount);
}

// other class implements this interface
// process : IdealState => cardInsertedState => withdrawState