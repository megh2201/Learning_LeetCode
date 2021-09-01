package medium;

public class RotateArrayWithoutTempArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArrayWithoutTempArray ra = new RotateArrayWithoutTempArray();
        ra.rotate(nums, k);
    }

    public void rotate(int[] nums, int k) {
        for(int i = 1;i<=k;i++) {
            int temp = nums[nums.length-1];
            for (int j = nums.length-1; j > 0 ; j--) {
                nums[j] = nums[j-1];
            }

            nums[0] = temp;
        }

        for(int i =0; i<nums.length;i++)
        System.out.println(nums[i]);
    }
}
