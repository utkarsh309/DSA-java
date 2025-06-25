import java.util.Arrays;

public class transposeMatrix {
    public static int [][] transposeFunction(int [][]matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        int [][]tranMatrix=new int [n][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int element=matrix[i][j];
                tranMatrix[j][i]=element;
            }
        }
        return tranMatrix;

    }
    public static void main(String[] args) {
        int [][]matrix={{1,2,3,4},{5,6,7,8}};
        int[][] result=transposeFunction(matrix);
        // for(int i=0;i<result.length;i++){
        //     for(int j=0;j<result[0].length;j++){
        //         System.out.print(result[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println(Arrays.deepToString(result));
    }
    
}
