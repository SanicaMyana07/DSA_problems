package task;
//leetcode problem: 268
class MissingNumberSolution {
    public static int[] sort(int []nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
    public static int missingNumber(int[] n) {
        int last=n.length;
        for(int i=0;i<n.length;){
            if( n[i]!=i ){
                i++;
                return i;
            }
            else if(n[last-1]!=last){
                return last;
            }else{
                return -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int []ns={0,0};
        int [] arr= MissingNumberSolution.sort(ns);
        int num= MissingNumberSolution.missingNumber(arr);
        System.out.println(num);
    }
}
