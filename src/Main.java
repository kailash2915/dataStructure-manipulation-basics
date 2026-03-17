//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    //Integers
    IntegerManipulation.swapNumbers(1,2);
    IntegerManipulation.reverseInteger(123);
    System.out.println(IntegerManipulation.oddOrEven(7));
    System.out.println(IntegerManipulation.primeOrNot(29));

    //Arrays
    ArrayManipulation.oddOrNot(List.of(5,3,2));
    int[] arr = {1,2,2,3};
    ArrayManipulation.findDuplicate(arr);
    int[] array = {1,2,2,3,16,29,30};
    ArrayManipulation.maxAndMinnumberInArray(array);
    ArrayManipulation.secondLargestInArray(array);
    ArrayManipulation.thirdLargestInArray(array);
    ArrayManipulation.reverseIntArray(array);

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


}
