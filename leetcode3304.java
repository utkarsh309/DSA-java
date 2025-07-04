import java.util.Scanner;

public class leetcode3304 {
    public static char kthElement(int k){
        StringBuilder sb=new StringBuilder("a");
        while(sb.length()<k){
            int size=sb.length();
            for(int i=0;i<size;i++){
                if(sb.charAt(i)=='z'){
                    sb.append('a');
                }else{
                sb.append((char)(sb.charAt(i)+1));
                }
            }
        }
        return sb.charAt(k-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println(kthElement(k));
    }
    
}
