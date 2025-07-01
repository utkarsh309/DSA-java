// maxsum in a sorted array
public class twoPointer {
    static void makeTwoPointer(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int currentSum=arr[left]+arr[right];
            if(currentSum==target){
                System.out.println("left index- "+left);
                System.out.println("right index- "+right);
                return;
            }
            else if(currentSum<target){
                left++;
            }else{
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=3;
        makeTwoPointer(arr, target);
    }
    
}
