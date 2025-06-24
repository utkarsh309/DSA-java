import java .util.Arrays;
public class leetCode59 {
    public static int [][] generateMatrix(int n){
        int [][]matrix=new int[n][n];
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        int value=1;

        while(startRow<=endRow && startCol<=endCol){
            // top
            for(int j=startCol;j<=endCol;j++){
                matrix[startRow][j]=value;
                value++;
            }
            // right
            for(int i=startRow+1;i<=endRow;i++){
                matrix[i][endCol]=value;
                value++;
            }
            // bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                matrix[endCol][j]=value;
                value++;
            }
            // left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                matrix[i][startCol]=value;
                value++;
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return matrix;

    }
    public static void main(String[] args) {
        int [][]result=generateMatrix(3);
        System.out.println(Arrays.deepToString(result));

    }
    
}
