import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        int[] colors = {1,2,2,2,0,0,1,1,2,0};
        sortColors(colors);

    }
    public static void sortColors(int[] nums) {

        for (int t = 0; t < nums.length;t ++) {
            if (nums[t] == 1) {
                for (int z = t -1; z > -1; z--) {
                    nums[z + 1] = nums[z];
                }
                nums[0] = 1;
            }
        }
        for (int l = 0; l < nums.length;l ++) {
            if (nums[l] == 0) {
                for (int z = l -1 ; z > -1; z--) {
                    nums[z + 1] = nums[z];
                }
                nums[0] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
