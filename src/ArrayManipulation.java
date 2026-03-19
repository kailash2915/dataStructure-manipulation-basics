import java.sql.SQLOutput;
import java.util.*;

public class ArrayManipulation {

    //1. Two sum
    //2. Odd or not
    //3. Remove duplicate
    //4. Min and max number in an array
    //5. Largest number in the array
    //6. Second-largest number in the array
    //7. Third-largest number in the array
    //8. Reverse an integer array
    //9. Move zeroes to end of an array
    //10. Rotate array by K elements
    //11. Find majority element in an array
    //12. First Repeating And First Non-Repeating Element
    //13. Find the missing number in an array from 1 to N.

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

    public static void removeDuplicate(int[] arr) {

        Set<Integer> a = new HashSet<>();

        for (int i = 0; i <= arr.length - 1; i++) {
            a.add(arr[i]);
        }

        System.out.println(a);

    }

    public static void maxAndMinNumberInArray(int[] num) {
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

    public static void moveZeroesToEnd(int[] arr) {
        int index = 0;
        for (int i : arr) {
            if (i != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void rotateArrayToRight(int[] arr, int k) {
        k = k % arr.length;
        //reverse entire array
        reverseArray(arr, 0, arr.length - 1);
        //first k element reverse
        reverseArray(arr, 0, k - 1);
        //after k element reverse again
        reverseArray(arr, k, arr.length - 1);
    }

    public static void reverseArray(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void findMajorityElementInAnArray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > n / 2) {
                System.out.println("Majority element in an array: "+i);
            }
        }
    }

    public static void arrayIsEqual(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1 == arr2) {
            System.out.println("equals");
        }
    }

    public static void firstRepeatingAndFirstNonRepeatingElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Integer firstRepeating = null;
        Integer firstNonRepeating = null;

        for (int i : arr) {
            if (map.get(i) > 1 && firstRepeating == null) {
                firstRepeating = i;
            }
            if (map.get(i) == 1 && firstNonRepeating == null) {
                firstNonRepeating = i;
            }

        }
        System.out.println("First Repeating Element: " + firstRepeating);
        System.out.println("First Non-Repeating Element: " + firstNonRepeating);

    }

    public static void missingNaturalNumbers(int[] arr, int N) {
        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }
        int result = actualSum - expectedSum;
        System.out.println("result: " + result);
    }

    public static void findDuplicatesInAnArray(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }

    public static void findMissingNumber(int[] arr) {

    }

}
