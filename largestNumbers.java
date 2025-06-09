public class largestNumbers {
    public static int largestNum(int[] num) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 6, 2, 10, 15, 35, 12};
        System.out.println(largestNum(numbers));
    }
}
