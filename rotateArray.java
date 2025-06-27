public class rotateArray {
    static void bruteforce(int [] arr,int k){
        int n=arr.length;
        int newArr[]=new int[n];
        int count=0;
        for(int i=n-k;i<n;i++){
            newArr[count]=arr[i];
            count++;
        }
        for(int i=0;i<n-k;i++){
            newArr[count]=arr[i];
            count++;
        }
       for(int i=0;i<n;i++){
        System.out.print(newArr[i]+" ");
       }
    }
    public static void main(String[] args) {
        int arr[]={15,7,9,5,6,7};
        int k=1;
        bruteforce(arr, k);


    }
}
