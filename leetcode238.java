public class leetcode238 {
    public static int [] productArray(int []arr){
        int n=arr.length;
        int []prefix=new int [n];
        int []suffix=new int [n];
        int []answer=new int [n];
        // prefix product of the array
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*arr[i];
        }
        // suffix product of the array
        suffix[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*arr[i];
        }
        answer[0]=suffix[0];
        answer[n-1]=prefix[n-2];
        for(int i=0;i<n;i++){
            if(i==0){
                answer[i]=suffix[]
            }
            answer[i]=prefix[i-1]*suffix[i+1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int []arr={4,3,2,1,2};
        int []ans=productArray(arr);
        for(int values:ans){
            System.out.print(values+" ");
        }

    }
    
}
