public class BPI_Atm {
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
      
        int amount = 290; // Amount to be dispensed
          System.out.println("Amount: " + amount);
        if (amount % 10 != 0) {
            System.out.println("Amount should be in multiples of 10s.");
            
        } else
        atmDispenser.dispense(new Currency(amount));
    }
}
