package medium;

public class RotateArrayWithReverseMethod {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArrayWithReverseMethod rotateArrayWithReverseMethod = new RotateArrayWithReverseMethod();
        rotateArrayWithReverseMethod.rotate(nums, k);
    }

    public void rotate(int[] nums, int k) {
        k = k % (nums.length);
        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);

        for(int i = 0; i <= nums.length-1; i++)
            System.out.println(nums[i]);
    }

    public static int[] reverseArray(int nums[], int start, int end){
        for(int i = start; i<end; i++){
            int temp = nums[i];
            nums[i] = nums[end];
            nums[end] = temp;
            end--;
        }

        return nums;
    }
}