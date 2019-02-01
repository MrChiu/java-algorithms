import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: qiudong
 * @description:
 * @date: Created in 14:30 2019-01-23
 */
public class Solution {
    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i==0||nums[i]!=nums[i-1]){
                int k=0-nums[i];
                int l=i+1;
                int r=nums.length-1;
                while(l<r){
                    if(l>i+1 && nums[l]==nums[l-1]){
                        l++;
                    }else if(r<nums.length-1 && nums[r]==nums[r+1]){
                        r--;
                    }else{
                        if(nums[l]+nums[r]==k){
                            List<Integer> list = new ArrayList<>(3);
                            list.add(nums[i]);
                            list.add(nums[l]);
                            list.add(nums[r]);
                            result.add(list);
                            l++;
                            r--;
                        }else if (nums[l]+nums[r]>k){
                            r--;
                        }else if(nums[l]+nums[r]<k){
                            l++;
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = new int[]{-4, -1, -1, 0, 1, 2};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }
}
