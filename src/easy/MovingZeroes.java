package easy;

public class MovingZeroes {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        MovingZeroes movingZeroes = new MovingZeroes();
        movingZeroes.moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {
        int checkedZeroPointer = 0;
        int uncheckedZeroPointer = nums.length;
        for (int i = 0; i < uncheckedZeroPointer; i++){
            if(nums[i] != 0){
                nums[checkedZeroPointer] = nums[i];
                checkedZeroPointer++;
            }
        }
        for (int j = checkedZeroPointer; j < uncheckedZeroPointer; j++){
            nums[j] = 0;
        }

        for(int i=0; i< nums.length;i++)
            System.out.println(nums[i]);
    }
}
