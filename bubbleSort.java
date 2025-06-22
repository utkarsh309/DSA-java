public class bubbleSort {
    public static int [] bubbleSortFunction(int []arr){
        int n=arr.length;
        for(int i=0;i<=n-2;i++){
            for(int j=0;j<=n-2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr={2,3,1,4,6,5};
        int []result=bubbleSortFunction(arr);
        for(int values:result){
            System.out.print(values+" ");
        }
    }
    
}
