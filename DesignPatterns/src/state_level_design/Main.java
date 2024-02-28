package state_level_design;

public class Main {

    // context class
    public static class Context {
        private State state;

        public Context() {
            // Set an initial state
            state = new StateA();
        }

        public void setState(State newState) {
            state = newState;
        }

        public void performAction() {
            state.doAction(this); // this refers to Context class itself
        }
    }

    // State interface
    public interface State {
        void doAction(Context context);
    }

    static class StateB implements State {
        public void doAction(Context context) {
            System.out.println("Performing Action in State B and changing state to State A");
            // Transition to a different state if needed
            context.setState(new StateA());
        }
    }

    static class StateA implements State {
        public void doAction(Context context) {
            System.out.println("Performing Action in State A and changing state to State B");
            // Transition to a different state if needed
            context.setState(new StateB());
        }
    }


    public static void main(String[] args) {
        Context context = new Context();
        context.performAction(); // Output: Performing Action in State A and changing state to State B
        context.performAction(); // Output: Performing Action in State B and changing state to State A
        context.performAction(); // Output: Performing Action in State A and changing state to State B
    }



}
