public class pallindrome {
    public static void main(String[] args) {
        String s="hello";
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                System.out.println("not a  pallindrome");
                break;
            }else{
                System.out.println("pallindrome");
            }
        }
    }
    
}
