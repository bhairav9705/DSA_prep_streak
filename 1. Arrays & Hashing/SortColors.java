public class SortColors {
  public void sortColors(int[] nums) {
    int left = 0;
    int mid = 0;
    int right = nums.length-1;

    while(mid <= right) {
      if(nums[mid] == 0) {
        swap(nums, mid, left);
        mid++;
        left++;
      } 
      else if(nums[mid] == 1) {
        mid++;
        continue;
      } 
      else {
        swap(nums, mid, right);
        right--;
      }
    }
  }

  private static void swap(int[] nums, int n1, int n2) {
    int temp = nums[n1];
    nums[n1] = nums[n2];
    nums[n2] = temp;
  }
}
