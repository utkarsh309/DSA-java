public class leetcode217 {
    public static boolean containsDuplicate(int []nums){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]!=nums[right]){
                left++;
                right--;
                
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums={0,4,5,0,3,6};
        System.out.println(containsDuplicate(nums) );

    }
    
}
