package easy;

public class MovingZeroes {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        MovingZeroes movingZeroes = new MovingZeroes();
        movingZeroes.moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {
        int checkedZeroPointer = nums.length;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                checkedZeroPointer = i;
                break;
            }
        }

        for (int i = checkedZeroPointer + 1 ; i < nums.length; ++i) {
            if(nums[i] !=0){
                nums[checkedZeroPointer] = nums[i];
                nums[i] = 0;
                ++checkedZeroPointer;
            }
        }

        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }
}








    /*int checkedZeroPointer = 0;

        for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
        nums[checkedZeroPointer] = nums[i];
        checkedZeroPointer++;
        }
        }
        for (int j = checkedZeroPointer; j < nums.length; j++) {
        nums[j] = 0;
        }

        for (int i = 0; i < nums.length; i++)
        System.out.println(nums[i]);*/