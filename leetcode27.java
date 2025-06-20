public class leetcode27 {
    public static int removeElement(int []arr,int val){
        int p=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=val){
                arr[p]=arr[i];
                p++;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        int arr[]={3,2,2,3};
        int val=3;
        System.out.println(removeElement(arr,val));
        for(int values:arr){
            System.out.println(values);
        }
    }
    
}
