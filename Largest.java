public class Largest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The largest number is " + max);
    }
    
}
