import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args) {
        int [] num1={1,2,3,0,0,0};
        int []num2={2,5,6};
        int n=num1.length;
        int m=3;
        int [] arr=new int[n];
        for(int i=0;i<m;i++){
            arr[i]=num1[i];
        }
        for(int i=0;i<num2.length;i++){
            arr[m+i]=num2[i];
        }
       
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
