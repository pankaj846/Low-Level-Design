package single_chain_of_responsibility;

// Request class
class WithdrawalRequest {
    private int amount;

    public WithdrawalRequest(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

// Handler interface
interface CashDispenser {
    void setNextDispenser(CashDispenser nextDispenser);

    void dispenseCash(WithdrawalRequest withdrawalRequest);
}

// Concrete Handler 1: ThousandRsDispenser
class ThousandRsDispenser implements CashDispenser {
    private CashDispenser nextDispenser;

    public void setNextDispenser(CashDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    public void dispenseCash(WithdrawalRequest withdrawalRequest) {
        int amount = withdrawalRequest.getAmount();
        int numNotes = amount / 1000;

        if (numNotes > 0) {
            System.out.println("Dispensing " + numNotes + " notes of 1000 Rs");
        }

        int remainingAmount = amount % 1000;

        if (remainingAmount > 0 && nextDispenser != null) {
            nextDispenser.dispenseCash(new WithdrawalRequest(remainingAmount));
        }
    }
}

// Concrete Handler 2: FiveHundredRsDispenser
class FiveHundredRsDispenser implements CashDispenser {
    private CashDispenser nextDispenser;

    public void setNextDispenser(CashDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    public void dispenseCash(WithdrawalRequest withdrawalRequest) {
        int amount = withdrawalRequest.getAmount();
        int numNotes = amount / 500;

        if (numNotes > 0) {
            System.out.println("Dispensing " + numNotes + " notes of 500 Rs");
        }

        int remainingAmount = amount % 500;

        if (remainingAmount > 0 && nextDispenser != null) {
            nextDispenser.dispenseCash(new WithdrawalRequest(remainingAmount));
        }
    }
}

// Concrete Handler 3: HundredRsDispenser
class HundredRsDispenser implements CashDispenser {
    private CashDispenser nextDispenser;

    public void setNextDispenser(CashDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    public void dispenseCash(WithdrawalRequest withdrawalRequest) {
        int amount = withdrawalRequest.getAmount();
        int numNotes = amount / 100;

        if (numNotes > 0) {
            System.out.println("Dispensing " + numNotes + " notes of 100 Rs");
        }
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Creating the chain of responsibility
        CashDispenser thousandRsDispenser = new ThousandRsDispenser();
        CashDispenser fiveHundredRsDispenser = new FiveHundredRsDispenser();
        CashDispenser hundredRsDispenser = new HundredRsDispenser();

        thousandRsDispenser.setNextDispenser(fiveHundredRsDispenser);
        fiveHundredRsDispenser.setNextDispenser(hundredRsDispenser);

        // Simulating a withdrawal request
        WithdrawalRequest withdrawalRequest = new WithdrawalRequest(3900);

        // Processing the withdrawal request through the chain
        thousandRsDispenser.dispenseCash(withdrawalRequest);
    }
}

