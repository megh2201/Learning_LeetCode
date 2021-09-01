package medium;

public class RotateArrayWithTempArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 101;
        RotateArrayWithTempArray rotateArrayWithTempArray = new RotateArrayWithTempArray();
        rotateArrayWithTempArray.rotate(nums, k);
    }

    public void rotate(int[] nums, int k) {
        k = k % (nums.length);
        int[] temp_arr = new int[k];

        for (int i = 0; i < k; i++)
            temp_arr[i] = nums[nums.length - k + i];

        if(k > 0) {
            for(int i = nums.length-k-1; i >=0; --i)
                nums[i + k] = nums[i];
        }

        for (int i = 0; i < temp_arr.length; i++)
            nums[i] = temp_arr[i];

        for(int i = 0; i < nums.length; ++i)
            System.out.println(nums[i]);
    }
}