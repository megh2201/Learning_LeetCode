package easy;

public class SearchInsertPosition {
    public static void main(String [] args){
        int nums[] = {1};
        int target = 0;
        SearchInsertPosition si = new SearchInsertPosition();
        System.out.println(si.searchInsert(nums, target));
    }

    public int searchInsert(int[] nums, int target) {
        int left =0, right = nums.length-1, mid = 0;

        while(left<=right){
            mid = left + (right - left)/2;

            if(nums[mid] == target)
                return mid;

            else if (nums[mid] < target)
                left = mid +1;

            else
                right = mid -1;
        }

        if(nums[mid] > target)
            return mid;

        else
            return mid + 1;
    }

}
