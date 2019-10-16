/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode_Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Alexander Chelpanov
 * Date: 16.10.2019
 * 
 * Suppose an array sorted in ascending order is rotated 
 * at some pivot unknown to you beforehand.
 * (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
 * Find the minimum element.
 * The array may contain duplicates.
 */
public class FindMin {
    public static void main(String[] args) {
        int [] a = {10,9,5,6,1,4,3,2,7};
        System.out.println(findMin(a));
    }
    
    public static int findMin(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }
        return Collections.min(arr);
    }
}
