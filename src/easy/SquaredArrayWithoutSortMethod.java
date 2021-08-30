package easy;

public class SquaredArrayWithoutSortMethod {
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

        for (int i = 0; i<=nums.length-1;++i)
        {
            for (int j=i+1; j<= nums.length-1; ++j)
            {
                int temp =0;

                if(nums[i] < nums[j]){
                    continue;
                }

                else{
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
