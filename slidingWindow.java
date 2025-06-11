public class slidingWindow {
 
    static int makeSlidingWindow(int [] arr,int win){
        int sum=0;
        for (int i=0;i<win;i++){
            sum=sum+arr[i];
        }
        int maxsum=sum;
        int n=arr.length;
        for(int i=1;i<=n-win;i++){
            sum=sum-arr[i-1]+arr[i+win-1];
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return maxsum;
    }
   public static void main(String[] args) {
     int arr[]={2,5,1,10,6,5,3};
     int win=3;
     System.out.println(makeSlidingWindow(arr, win));

   } 
    
}
