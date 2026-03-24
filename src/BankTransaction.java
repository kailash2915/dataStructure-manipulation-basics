import java.util.*;

public class BankTransaction {
    String transactionId;
    double amount;
    String type;
    String accountId;

    public BankTransaction(String transactionId, double amount, String type, String accountId) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.type = type;
        this.accountId = accountId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    //total balance per account
    //Duplicate transaction
    //account with more than 3 transactions

    public static Map<String, Double> totalBalancePerAccount(List<BankTransaction>  transactions) {
        Map<String, Double> countMap = new HashMap<>();
        for (BankTransaction transaction : transactions) {
            double amount = transaction.type.equals("CREDIT") ? transaction.amount : -transaction.amount;
            countMap.put(transaction.accountId, countMap.getOrDefault(transaction.accountId, 0.0) + amount);
        }
        return countMap;
    }

    public static Set<BankTransaction> duplicateAmount(List<BankTransaction> transactions) {
        Set<BankTransaction> removeDuplicate = new HashSet<>();
        removeDuplicate.addAll(transactions);
        return removeDuplicate;
    }

    public static List<String> getHighActivity(List<BankTransaction> transactions) {
        Map<String, Integer>  countMap = new HashMap<>();
        for (BankTransaction transaction : transactions) {
            countMap.put(transaction.accountId, countMap.getOrDefault(transaction.accountId, 0) + 1);
        }
        List<String> highActivity = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if(entry.getValue() > 3) {
                highActivity.add(entry.getKey());
            }
        }
        return highActivity;
    }
}
