import java.util.HashMap;
import java.util.Scanner;
public class countAnagram {
    public static int countAnagrams(String text,String pattern){
        int patternLength=pattern.length();
        int totalcount=0;
        HashMap<Character,Integer>patternMap=buildfreqmap(pattern);

        for(int i=0;i<=text.length()-patternLength;i++){
            String window=text.substring(i, i+patternLength);
            HashMap<Character,Integer>windowMap=buildfreqmap(window);
            if(windowMap.equals(patternMap)){
                totalcount++;
            }
        }
        return totalcount;
    }

    public static HashMap<Character,Integer> buildfreqmap(String str){
         HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
          
            if (freqMap.containsKey(ch)) {
               
                int currentCount = freqMap.get(ch);
                freqMap.put(ch, currentCount + 1);
            } else {
               
                freqMap.put(ch, 1);
            }
            
        } 
        return freqMap;
    }


   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String pattern = sc.nextLine();
    String text = sc.nextLine();

    int count = countAnagrams(text, pattern);
    System.out.println("Total anagrams  " + count);
   } 
}
