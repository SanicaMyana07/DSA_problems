package questions;

import java.util.Arrays;

public class Kdiff {
    public int[] removeDuplicates(int nums[]){
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1]){
                nums[i]=-1;
            }
            i++;
        }
        int count=0;
        int nums2[]= new int[nums.length];
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=-1){
                nums2[count]=nums[j];
                count++;
            }
        }
        return nums2;
    }

    public int findpairs(int nums[],int k){
        int count=0;
        for(int i=0;i< nums.length-1;i++){
            for (int j=i+1;j< nums.length;j++){
                if( nums[i]-nums[j]  ==  k || nums[i]-nums[j]==  -k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int nums[]={3,1,4,1,5};
        Kdiff sol= new Kdiff();
        int [] nums2= sol.removeDuplicates(nums);
        int pairs= sol.findpairs(nums2,2);
        System.out.println();
        System.out.println(pairs);

    }

}
