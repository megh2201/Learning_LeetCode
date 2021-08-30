package easy;

import java.util.Arrays;

public class SquaredArrayWithSortMethod {
    public static void main(String [] args){
        int[] nums = {-7,-3,2,3,11};
        SquaredArrayWithoutSortMethod sr = new SquaredArrayWithoutSortMethod();
        int[] numsOutput = sr.sortedSquares(nums);
        for (int i: numsOutput) {
            System.out.println(i);
        }
    }

    public int[] sortedSquares(int[] nums) {
        for (int i =0; i<=nums.length-1; ++i){
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}
