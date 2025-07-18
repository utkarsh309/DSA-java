import java.util.*;
public class subString {
    public static int subStringCount(String s,int k){
        int count=0;
        for(int i=0;i<=s.length()-k;i++){
            String sub=s.substring(i, i+k);
            boolean ans=checkDistinct(sub, k);
            if(ans==true){
                count++;
            }
        }
        return count;

    }
    public static boolean checkDistinct(String sub,int k){
        HashSet<Character> set=new HashSet<>();
        for(int j=0;j<sub.length();j++){
            if(!set.contains(sub.charAt(j))){
                set.add(sub.charAt(j));
            }
        }
        if(set.size()==k-1){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        int result=subStringCount(s, k);
        System.out.println(result);
    }
}
