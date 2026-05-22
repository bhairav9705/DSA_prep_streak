import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
  
  public int longestConsecutive(int[] nums) {
    if(nums.length == 0) return 0;
  
    Set<Integer> set = new HashSet<>();
    for(int n : nums) set.add(n);

    int maxCount = 0;
    for (int num : set) {
      if (!set.contains(num - 1)) {
        int currentNum = num;
        int count = 1;

        while (set.contains(currentNum + 1)) {
          currentNum += 1;
          count += 1;
        }

        maxCount = Math.max(maxCount, count);
      }
    }
    
    return maxCount;
  }

}
