public class NumberPyramid {
    public static void main(String[] args) {
        int number = 1;
        int rows = 3;

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
}