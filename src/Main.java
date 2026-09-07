//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    PaymentProcessor processor = PaymentProcessorFactory.getProcessor("UPI");

    Transaction txn = new Transaction.Builder("txn1", "cust1", 500)
            .currency("INR")
            .build();

    processor.processPayment(txn.getAmount());

    TransactionLogger.getInstance().log("Transaction Success");

}
