package Day5;

import java.util.Scanner;

public class RecursionEx {
    static long fact(int n) {
        if(n == 0) {
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        //int n = 5;
        System.out.println(fact(n));
    }
    
}
