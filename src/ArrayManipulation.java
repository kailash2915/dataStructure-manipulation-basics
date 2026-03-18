import java.util.*;

public class ArrayManipulation {

    //1. Two sum
    //2. Odd or not
    //3. Find duplicate
    //4. Min and max number in an array
    //5. Largest number in the array
    //6. Second-largest number in the array
    //7. Third-largest number in the array
    //8. Reverse an integer array
    //9. Move zeroes to end of an array

    public int[] twoSum(int[] nums, int target) {
        int i = 2;
        return new int[]{i};
    }

    public static void oddOrNot(List<Integer> list) {
        List<Integer> odd = list
                .stream()
                .filter(n -> n % 2 != 0)
                .toList();
        System.out.println(odd);
    }

    public static void findMissingNumber(int[] arr) {

    }

    public static void findDuplicate(int[] arr) {

        Set<Integer> a = new HashSet<>();

        for (int i = 0; i <= arr.length - 1; i++) {
            a.add(arr[i]);
        }

        System.out.println(a);

    }

    public static void maxAndMinnumberInArray(int[] num) {
        int max = num[0];
        int min = num[0];

        for (int number : num) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("MAX AND MIN ARE: " + max + " " + min);
    }

    public static void largestInArray(int[] arr) {
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("largest: " + largest);
    }

    public static void secondLargestInArray(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i != largest) {
                secondLargest = i;
            }
        }
        System.out.println("second largest: " + secondLargest);
    }

    public static void thirdLargestInArray(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        int thirdLargest = arr[0];
        for (int i : arr) {
            if (i > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i != largest) {
                thirdLargest = secondLargest;
                secondLargest = i;
            } else if (i > thirdLargest && i != secondLargest) {
                thirdLargest = i;
            }
        }
        System.out.println("second largest and third largest are: " + secondLargest + thirdLargest);
    }

    public static void reverseIntArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            list.add(arr[i]);
        }
        System.out.println("" + list);
    }

    public static void moveZeroesToEnd(int[] arr){
        int index = 0;
        for(int i:arr){
            if(i!=0){
                arr[index++]= arr[i];
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
    }


}
