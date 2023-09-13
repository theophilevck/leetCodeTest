package arrays;

import java.util.*;

public class findKthLargest {

    public static int findKthLargest(int[] nums, int k) {

        HashMap <Integer,Integer > map =new HashMap<>();
//        for(int i = 0 ; i< nums.length;i++){
//            map.put(nums[i],i);
//        }

                for(int i = nums.length -1 ; i> 0;i--){
            map.put(nums[i],i);
        }

       return  map.get(k)-nums.length;

    }

    public static void main(String[] args) {
        int[] input = {3,2,1,5,6,4};
        int k =4;
        System.out.println(findKthLargest(input,k));
    }


}
