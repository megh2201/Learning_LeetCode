package easy;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int left =1, right = n, badVersion =0;

        while(left<=right){
            int mid = left + (right - left)/2;

            if(isBadVersion(mid)) {
                badVersion = mid;
                right = mid - 1;
            }

            else
                left = mid +1;
        }
        return badVersion;
    }

    // Dummy Method to make logic work
    public boolean isBadVersion(int version){
        return true;
    }
}
