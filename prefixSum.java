import java.util.*;

public class prefixSum {
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    // //by creating a new array
    // static int[] makePrefixSum(int [] arr){
    //     int n=arr.length;
    //     int [] pref=new int[n];
    //     pref[0]=arr[0];
    //     for(int i=1;i<n;i++){
    //         pref[i]=pref[i-1]+arr[i];
    //     }
    //     return pref;
    // }
    //by same array
     static int[] makePrefixSum(int [] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter " +n+ "elements");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered Array is : ");
        printArray(arr);
        System.out.println("prefix Array is: ");
        int [] pref=makePrefixSum(arr);
        printArray(pref);
        sc.close();
    }
    
}
