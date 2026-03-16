public class IntegerManipulation {

    //1. Swap nummbers
    //2. Prime or not
    //3. Odd or even
    //4. Fibonacci
    //5. Factorial
    //6. Reverse an integer
    //7. Reverse

    public static Integer swapNumbers(Integer number1, Integer number2) {
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("after swapping number 1: " + number1 + " number 2: " + number2);
        return 0;
    }

    public static Boolean primeOrNot(Integer n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String oddOrEven(Integer integer) {
        if (integer % 2 == 0) {
            return "true";
        } else return "false";
    }

    public static void printFibonacci(int count) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 0; i <= count; i++) {
            System.out.println(a + ",");
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static long factorial(long n) {
        if (n == 1)
            return 1;
        else {
            return (n * factorial(n - 1));
        }
    }

    public static void reverseInteger(int arr) {

        int rev = 0;
        while (arr != 0) {
            int d = arr % 10;
            rev = rev * 10 + d;
            arr = arr / 10;
        }
        System.out.println(rev);
    }


}
