import java.util.*;

public class Practise {

    public static void minAndMax(int[] array){

        int min = array[0];
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
            System.out.println(max + min);
        }
    }

    public static void secondLargestElement(int[] arr){
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i:arr){
            if(i>largest){
                secondLargest=largest;
                largest=i;
            } else if (i!=largest && i>secondLargest) {
                secondLargest=i;
            }
        }
        System.out.println("second largest: " + secondLargest);
    }

    public static void reverseAnArray(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i =arr.length-1;i>=0;i--){
            list.add(arr[i]);
        }
        System.out.println(list);
    }

    public static void removeDuplicatesFromAnArray(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int i: arr){
            set.add(i);
        }

        System.out.println(set);
    }

    public static void findDuplicateElements(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }

    public static void findMissingNumbers(int[] arr,int N){
        int expectedSum = N*(N+1)/2;
        int actualSum = 0;
        for(int i:arr){
            actualSum+=i;
        }
        int result = expectedSum-actualSum;
        System.out.println("result"+ result);
    }

    public static void moveZeroesToTheEnd(int[] arr){
        //arr = {1,2,0,3,0,4,3}
        Arrays.sort(arr);
        int index=0;
        for(int i:arr){
            if(i!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
    }

    public static void twoSum(int[] arr, int N){
        for(int i = 0;i<=arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j] == N){
                    System.out.println("i and j are: "+ arr[i]+" "+ arr[j]);
                }
            }
        }
    }

    public static void printDuplicate(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> mapEntry: map.entrySet()){
            if(mapEntry.getValue()>1){
                System.out.println(mapEntry.getKey());
            }
        }
    }

    public static void firstNonRepeatingCharacter(String input){
        char[] arr = input.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Character,Integer> mapEntry: map.entrySet()){
            if(mapEntry.getValue()==1){
                System.out.println(mapEntry.getKey());
                return;
            }
        }
    }

    public static void reverseInteger(int input){
       int rev=0;
       while(input!=0){
           int temp = input%10;
           rev=rev*10+temp;
           input = input/10;
       }
        System.out.println(rev);
    }

    public static void twoSums(int[] arr, int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j =i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("indices are: "+ i+j + "numbers are: " + arr[i]+arr[j]);
                }
            }
        }
    }

    public static void tumSum2(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int complement = target-arr[i];
            if(map.containsKey(complement)){
                System.out.println("Indices: " + map.get(complement) + ", " + i);
                return;
            }
            map.put(arr[i],i);
        }
    }

    }