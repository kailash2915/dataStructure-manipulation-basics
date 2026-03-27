Java Streams – Interview Questions (Notes)

**Beginner Level**
1. Convert an int[] to List<Integer> using streams
Hint: Use Arrays.stream() and boxing.
2. Find the maximum and minimum value in an array using streams
Hint: max() / min() return Optional.
3. Calculate sum and average of integers using streams
Hint: Use IntStream.sum() and average().
4. Filter even numbers from a list using streams
Hint: Use filter(n -> n % 2 == 0).
5. Sort a list of integers using streams (ascending & descending)
Hint: Use sorted() and Comparator.reverseOrder().

**Intermediate Level**

1. Remove duplicate elements from a list using streams
Hint: distinct() preserves insertion order.
2. Count frequency of each element in a list using streams
Hint: Collectors.groupingBy() + Collectors.counting().
3. Find the first non‑repeating character in a string using streams
Hint: Use LinkedHashMap to preserve order. 
4. Group a list of strings by their length using streams
Hint: groupingBy(String::length). 
5. Merge two lists, remove duplicates, and sort them using streams
Hint: Use Stream.concat() → distinct() → sorted(). 
6. Partition numbers into even and odd using streams
Hint: Use Collectors.partitioningBy(). 
7. Find the longest string in a list using streams
Hint: Use max(Comparator.comparing(String::length)).

🔴 Advanced Level

1. Flatten a List<List<Integer>> into a single list using streams
Hint: Use flatMap() instead of map(). 
2. Find the second highest number in a list using streams
Hint: Use distinct() then sorted(desc) and skip first. 
3. Check if a list or array is a palindrome using streams
Hint: Compare mirrored indices with IntStream.range(). 
4. Difference between map() and flatMap() with example
Hint: map() transforms, flatMap() flattens. 
5. Difference between Stream.of() and Arrays.stream()
Hint: Important for primitive arrays vs object arrays.
6. Difference between Collectors.toList() and Stream.toList()
Hint: Mutability + Java version differences. 
7. Explain intermediate vs terminal operations in streams
Hint: Streams are lazy until terminal operation. 
8. When should parallel streams be used and when avoided?
Hint: CPU‑bound, stateless, non‑blocking tasks only.


