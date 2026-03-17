import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringManipulation {


    public String reverse(String in) {
        if (in == null) {
            throw new IllegalArgumentException("No input found");
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = in.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            stringBuilder.append(charArray[i]);
        }
        return stringBuilder.toString();
    }

    public static Boolean vowelFinder(String input) {
        return input.toLowerCase().matches(".*[aeiou]*.");
    }

    public static Boolean palindromeOrNot(String name) {
        if (name == null) {
            return false;
        }
        int nameLength = name.length();
        boolean result = true;
        char[] chars = name.toCharArray();
        for (int i = 0; i < nameLength / 2; i++) {
            if (name.charAt(i) != name.charAt(nameLength - i - 1)) ;
            result = false;
        }
        return result;
    }

    public static void palindromeString(String in) {
        //edge case
        if (in == null) {
            throw new IllegalArgumentException("No input found");
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = in.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            stringBuilder.append(charArray[i]);
        }
        String reverse = stringBuilder.toString();

        if (in.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    public static void countOccurenceInString(String in) {
        //edge case
        if (in == null) {
            throw new IllegalArgumentException("No input found");
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = in.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i <= charArray.length-1; i++) {
            map.put(charArray[i], map.getOrDefault(charArray[i],0)+1);
        }
        System.out.println("Count of occurence"+ map);

    }

    public static void firstNonRepeatingCharInString(String a) {
        if (a == null || a.isEmpty()) {
            System.out.println("No non-repeating character");
            return;
        }

        Map<Character,Integer> map = new LinkedHashMap<>();

        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.println("First repeating char: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character");
    }

    public static void anagramOrNot(String a, String b){
        char[] chara = a.toCharArray();
        char[] charb = b.toCharArray();

        Arrays.sort(chara);
        Arrays.sort(charb);

        if(Arrays.equals(chara, charb)){
            System.out.println("anagram");
        }
        else {
            System.out.println("not anagram");
        }

    }

    public static void charFrequency(String input){
        char[] chars = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i<=input.length()-1;i++){
            map.put(chars[i], map.getOrDefault(chars[i],0)+1);
        }
        System.out.println("Occurence" + map);
    }

    public static void subString(String input){
        for(int i =0;i<=input.length();i++){
            for(int j = i+1;j<=input.length();j++){
                System.out.println("substring: " + input.substring(i,j));
            }
        }
    }


}
