import java.util.Map;

public class SubArraySumEqualsK {
  
  public int subarraySum(int[] nums, int k) {
    int currSum = 0, count = 0;
    Map<Integer, Integer> map = new java.util.HashMap<>();
    map.put(0, 1);

    for(int i=0; i<nums.length; i++) {
      currSum += nums[i];
      int target = currSum - k;

      if(map.containsKey(target)) {
        count += map.get(target);
      }
      map.put(currSum, map.getOrDefault(currSum, 0) + 1);
    }
    
    return count;
  }

}
