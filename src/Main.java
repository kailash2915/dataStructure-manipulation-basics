void main() {

    //Integers
    IntegerManipulation.swapNumbers(1,2);
    IntegerManipulation.reverseInteger(123);
    System.out.println(IntegerManipulation.oddOrEven(7));
    System.out.println(IntegerManipulation.primeOrNot(29));

    //Arrays
    ArrayManipulation.oddOrNot(List.of(5,3,2));
    int[] arr = {1,2,2,3};
    ArrayManipulation.removeDuplicate(arr);
    int[] array = {1,2,3,3,16,18,30};
    int[] arr1 = {2, 2, 1, 1, 2, 2, 2};
    ArrayManipulation.maxAndMinNumberInArray(array);
    ArrayManipulation.secondLargestInArray(array);
    ArrayManipulation.thirdLargestInArray(array);
    ArrayManipulation.reverseIntArray(array);
    ArrayManipulation.findMajorityElementInAnArray(arr1);

    //Strings
    String a = "Jayshree";
    StringManipulation b = new StringManipulation();
    System.out.println("reverse program: " + b.reverse(a));
    StringManipulation.palindromeString("anab");
    StringManipulation.countOccurenceInString("kailash");
    StringManipulation.firstNonRepeatingCharInString("kailashk");
    StringManipulation.anagramOrNot("kailash", "kailash");
    StringManipulation.charFrequency("kailash");
    StringManipulation.subString("Computer");
    StringManipulation.firstRepeating("kailashh");
    StringManipulation.findCountOfAchar("kailash");

    //Practise
    Practise.twoSum(array,19);

    //Create transactions
    BankTransaction bankTransaction1 = new BankTransaction("1345",890.23,"CREDIT","1254");
    BankTransaction bankTransaction2 = new BankTransaction("25345",1000,"CREDIT","1354");
    BankTransaction bankTransaction3 = new BankTransaction("23445",1089.23,"CREDIT","1454");

    List<BankTransaction> bankTransactions = new ArrayList<>();
    bankTransactions.add(bankTransaction1);
    bankTransactions.add(bankTransaction2);
    bankTransactions.add(bankTransaction3);

    //Execute methods
    BankTransaction.duplicateAmount(bankTransactions);
    BankTransaction.totalBalancePerAccount(bankTransactions);
    BankTransaction.totalBalancePerAccount(bankTransactions);


    //API
    String apiEndpoint = "https://jsonplaceholder.typicode.com/users/1";
    try {
        List<String> data = ApiDataProcessor.fetchDataFromApi(apiEndpoint);
        System.out.println("Fetched Data: " + data);

        Set<String> duplicates = ApiDataProcessor.findDuplicates(data);
        System.out.println("Duplicate Elements: " + duplicates);

    } catch (Exception e) {
        e.printStackTrace();
    }

}
