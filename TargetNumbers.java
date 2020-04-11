import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TargetNumbers {
    public static void main (String ar[]){
        
        int[] intArray = new int[]{ 3, 3}; 
        System.out.println(Arrays.toString(twoSum(intArray, 6)));
        
    }
    
    
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;

        Map<Integer, Integer> IndexValuePair = new HashMap<Integer, Integer>();
        int result[]; // declaring array
        result = new int[2];

        for (int i = 0; i < len; i++) {
            if (IndexValuePair.containsKey(new Integer(target - nums[i]))) {
                result[0] = IndexValuePair.get(new Integer(target - nums[i]));
                result[1] = i;
                return result;
            }
            IndexValuePair.put(new Integer(nums[i]), new Integer(i));
        }

        return result;

    }
    
}
