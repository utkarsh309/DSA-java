public class generatePair {
    public static void main(String[] args) {
        int[] arr={2,1,4,6};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}