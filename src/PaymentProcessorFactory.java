public class PaymentProcessorFactory {

    public static PaymentProcessor getProcessor(String type){

        if(type.equalsIgnoreCase("UPI")){
            return new UpiProcessor();
        } else if(type.equalsIgnoreCase("NETBANKING")){
            return new NetBankingProcessor();
        } else if (type.equalsIgnoreCase("CREDITCARD")) {
            return new CreditCardProcessor();

        } else {
            throw new IllegalArgumentException("Invalid payment processor type");
        }
    }

}
