import java.util.*;
import java.util.stream.Collectors;

public class Transaction {

    String accountId;
    int amount;
    String transactionId;
    String accountType;

    public Transaction(String accountId, int amount, String transactionId, String accountType) {
        this.accountId = accountId;
        this.amount = amount;
        this.transactionId = transactionId;
        this.accountType = accountType;
    }

    //total balance per account

    public static Map<String, Integer> totalBalancePerAccount(List<Transaction> transactions) {

        Map<String, Integer> balancePerAccount = new HashMap<>();
        for (Transaction transaction : transactions) {
            int amount = transaction.accountType.equals("CREDIT") ? transaction.amount : -transaction.amount;
            balancePerAccount.put(transaction.accountId, balancePerAccount.getOrDefault(transaction.accountId, 0) + amount);
        }

        return balancePerAccount;
    }
    //Duplicate transaction

    public static Set<Transaction> uniqueTransaction(List<Transaction> transactions) {
        Set<Transaction> uniqueItems = new HashSet();
        uniqueItems.addAll(transactions);
        return uniqueItems;
    }
    //account with more than 3 transactions

    public static List<String> accountWithMoreThanGivenTransactions(List<Transaction> transactions, int count) {

        Map<String, Integer> accountMap = new HashMap<>();
        for (Transaction transaction : transactions) {
            accountMap.put(transaction.accountId, accountMap.getOrDefault(transaction.accountId, 0) + 1);
        }
        List<String> highActivity = new ArrayList<>();
        for (Map.Entry<String, Integer> item : accountMap.entrySet()) {
            if (item.getValue() > count) {
                highActivity.add(item.getKey());
            }
        }

        return highActivity;

    }

    //group by account id and then by type

    public static Map<String, Map<String, List<Transaction>>> groupAccountId(List<Transaction> transactions) {

        return transactions.stream().collect(Collectors.groupingBy(transaction -> transaction.accountId, Collectors.groupingBy(transaction -> transaction.accountType)));
    }
}
