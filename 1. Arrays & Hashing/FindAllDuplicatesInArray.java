import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
  
  public List<Integer> findDuplicates(int[] nums) {
    List<Integer> res = new ArrayList<>();

    for(int i=0; i<nums.length; i++) {
      int home = Math.abs(nums[i]) - 1;
      if(nums[home] < 0) {
        res.add(Math.abs(nums[i]));
      } else {
        nums[home] = nums[home] * -1;
      }
    }

    return res;
  }

}
