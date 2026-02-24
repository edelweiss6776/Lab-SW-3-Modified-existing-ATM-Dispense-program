public class ATMDispenseChain implements DispenseChain {
    private DispenseChain nextChain;
    public ATMDispenseChain() {
        // Initialize the chain
        this.nextChain = new Peso1000Dispenser();
        DispenseChain peso500Dispenser = new Peso500Dispenser();
        DispenseChain peso200Dispenser = new Peso200Dispenser();
        DispenseChain peso100Dispenser = new Peso100Dispenser();
        DispenseChain peso50Dispenser = new Peso50Dispenser();
        DispenseChain peso20Dispenser = new Peso20Dispenser();


        // Set the chain of responsibility
        nextChain.setNextChain(peso500Dispenser);
        peso500Dispenser.setNextChain(peso200Dispenser);
        peso200Dispenser.setNextChain(peso100Dispenser);
        peso100Dispenser.setNextChain(peso50Dispenser);
        peso50Dispenser.setNextChain(peso20Dispenser);
    }


    public void dispense(Currency currency) {
        nextChain.dispense(currency);
    }


    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }
}
