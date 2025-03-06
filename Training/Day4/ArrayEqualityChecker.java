package Day4;
import java.util.Arrays;

public class ArrayEqualityChecker {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        if (Arrays.equals(array1, array2)) {
            System.out.println("Array1 and Array2 are equal");
        } else {
            System.out.println("Array1 and Array2 are not equal");
        }
    }

}