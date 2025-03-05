package Day4;
public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 56, 89, 12, 90, 7};
        int max = numbers[0];

        for (int i=0; i<numbers.length; i++) {
            int num = numbers[i];
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest element in the array: " + max);
    }
}