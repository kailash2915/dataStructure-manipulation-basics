import java.util.HashMap;
import java.util.Map;

public class MixedDataStructure {

    public static void twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                System.out.println(needed + " " + nums[i]);
                return;
            }
            map.put(nums[i], i);
        }
    }

}
