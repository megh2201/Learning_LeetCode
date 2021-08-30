package easy;

public class SquareRoot {
    public static void main(String[] args) {
        int target = 65;
        SquareRoot sr = new SquareRoot();
        System.out.println(sr.mySqrt(target));
    }

    public int mySqrt(int x) {

        long left = 1;
        long right = x/2, sqrt = 0;

        if(x == 0 || x ==1)
            return x;

        else {
            while (left <= right) {
                long mid = left + (right - left) / 2;

                if ((mid * mid) <= x) {
                    sqrt = mid;
                    left = mid + 1;
                } else
                    right = (int) mid - 1;
            }

            return (int) sqrt;
        }
    }
}


// while (left <= right) {
//         long mid = left + (right - left) / 2;
//
//         if ((mid * mid) > x) {
//         right = (int) mid - 1;
//         } else
//         left = mid + 1;
//         sqrt = mid;
//         }
//
//         if (sqrt * sqrt > x)
//         return (int) sqrt - 1;
//         else
//         return (int) sqrt;

