public final class TransactionLogger {

    private TransactionLogger() {
    }

    private static class Holder {
        private static final TransactionLogger INSTANCE = new TransactionLogger();
    }

    public static TransactionLogger getInstance() {
        return Holder.INSTANCE;
    }

    public void log(String message) {
        System.out.println("[Transaction Log] " + message);
    }
}

// 