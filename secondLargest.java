public class secondLargest {
     public static void secondLargestNum(int[] num) {
        int largest = Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                secondLargest=largest;
                largest=num[i];
            }else if(num[i]>secondLargest){
                secondLargest=num[i];
            }
        }
       System.out.println("Largest number is- "+largest);
       System.out.println("Second Largest number is- "+secondLargest);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 6, 2, 10, 15, 35, 12};
        secondLargestNum(numbers);
    }
}
