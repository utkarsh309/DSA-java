import java.util.*;
public class primeRange {
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int count=0;
        for(int i=x;i<=y;i++){
            if(isPrime(i)==true){
                System.out.println(i);
                count++;
            }
        }
    }
    
}
