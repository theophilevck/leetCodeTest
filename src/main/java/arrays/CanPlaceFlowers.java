package arrays;

public class CanPlaceFlowers {

    //605. Can Place Flowers

    //You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
    //
    //Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;
        int left = 0;
        int right = length - 1;

        if (n == 0) {
            return true;
        }

        while (left <= right) {
            if (flowerbed[left] == 0 && (left == 0 || flowerbed[left - 1] == 0) && (left == flowerbed.length - 1
                    || flowerbed[left + 1] == 0)) {
                flowerbed[left] = 1;
                count++;
            }
            if (right != left) {
                if (flowerbed[right] == 0 && (right == length - 1 || flowerbed[right + 1] == 0) && flowerbed[right - 1] == 0) {

                    flowerbed[right] = 1;
                    count++;
                }
            }
            right--;
            left++;
        }
        return count >= n;
    }
}
