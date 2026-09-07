import java.time.LocalDateTime;

public class Transaction {

    // mandatory fields
    private final String transactionId;
    private final String customerId;
    private final double amount;

    // optional fields
    private final String currency;
    private final String notes;
    private final LocalDateTime timestamp;


    private Transaction(Builder builder) {
        this.transactionId = builder.transactionId;
        this.customerId = builder.customerId;
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.notes = builder.notes;
        this.timestamp = builder.timestamp;
    }

    public void printTransaction() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Amount: " + amount);
        System.out.println("Currency: " + currency);
        System.out.println("Notes: " + notes);
        System.out.println("Timestamp: " + timestamp);
    }

    public double getAmount() {
        return amount;
    }

    public static class Builder {

        // mandatory fields
        private final String transactionId;
        private final String customerId;
        private final double amount;

        // optional fields
        private String currency;
        private String notes;
        private LocalDateTime timestamp;

        public Builder(String transactionId, String customerId, double amount) {
            this.transactionId = transactionId;
            this.customerId = customerId;
            this.amount = amount;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public Builder timestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }

}
