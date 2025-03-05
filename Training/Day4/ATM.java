package Day4;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        int attempts = 3;
        while (attempts > 0){
            System.out.println("Enter your pin: ");
        int enteredPin = sc.nextInt();
            if (enteredPin == pin){
                System.out.println("pin verified successfully!");
                break;
            } else {
                attempts--;
                System.out.println("invalid pin!");
                
            }
        }
        if (attempts == 0){
            System.out.println("Your card is blocked!");
        }


    }
    
}
