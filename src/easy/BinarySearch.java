package easy;

public class BinarySearch {
    public static void main(String [] args){
        int nums[] = {1,3,4,8,9};
        int target = 5;
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int left =0, right = nums.length-1;

        while(left<=right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target)
                return mid;

            else if (nums[mid] < target)
                left = mid +1;

            else
                right = mid -1;
        }

        return -1;
    }

}
