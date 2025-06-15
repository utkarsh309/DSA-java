public class maxSum {
    public static void main(String[] args) {
        int[]arr={2,3,-8,7,-1,2,3};
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int currentSum=0;
            for(int j=i;j<arr.length;j++){
                currentSum+=arr[j];
                maxSum=Math.max(currentSum,maxSum);

            }

        }
        System.out.println(maxSum);
    }
    
}
