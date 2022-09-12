//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.*;

public class TwoPointers {

    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);

        return nums;

    }



    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];

        while (k > nums.length) {
            k = k - nums.length;
        }
        // index: i --->  i + k
        // if i + k >= nums.length ----> new-index = (i + k) - nums.length
        // length 4; i = 2, k = 5 ---> i + k = 7 ---> 7 - 4 = 3
        for (int i = 0; i < nums.length; i++) {
            if (i + k >= nums.length) {
                arr[i + k - nums.length] = nums[i];
            } else {
                arr[i + k] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }

    public int[] moveZeroes(int[] nums) {
        //NB original LeetCode problem returns void type, 
        List<Integer> list = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            if (nums.length == 1) {
                return nums;
            } else if (nums[i] != 0){
                list.add(nums[i]);
            }
        }
        while (list.size() < nums.length) {
            list.add(0);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
