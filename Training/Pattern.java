public class Pattern {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;

        for (int i = 1; i <= rows; i++) {
            System.out.println(i);
            for (int j = 1; j <= cols; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}