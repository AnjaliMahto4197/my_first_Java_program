// Base class
class Transaction {

    void process() {
        System.out.println("Processing normal transaction.");
    }

    void process(double amount) {
        System.out.println("Processing a parameter  of amount: " + amount);
    }
}

// Subclass
class BankTransaction extends Transaction {
    // Overridden method
    @Override
    void process() {
        System.out.println("Processing a bank transaction.");
    }
}

public class Overloading_and_Overriding {
    public static void main(String[] args) {
        Transaction normal = new Transaction();
        BankTransaction bankTransaction = new BankTransaction();

        // Test cases

        normal.process();
        normal.process(1000.0);


        bankTransaction.process();
    }
}



