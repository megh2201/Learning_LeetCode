package easy;

public class TwoSumArray {
    public static void main(String [] args){
        int numbers[] = {2,3,4};
        int target = 7;
        TwoSumArray twoSumArray = new TwoSumArray();
        System.out.println(twoSumArray.twoSum(numbers, target));
    }

    public int[] twoSum(int[] numbers, int target) {
        int leftValue = 0;
        int rightValue = numbers.length - 1;

        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[leftValue] + numbers[rightValue] == target) {
                return new int[]{leftValue+1, rightValue+1};
            }

            else if (numbers[leftValue] + numbers[rightValue] > target)
                rightValue = rightValue - 1;

            else
                leftValue = leftValue + 1;
        }
        return null;
    }
}




/**/
