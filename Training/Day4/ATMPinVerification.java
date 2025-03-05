package Day4;

public class ATMPinVerification {
    public static void main(String[] args) {
        int pin = 1234;
        int attempts = 3;
        while (attempts > 0) {
            System.out.println("Enter your pin: ");
            int enteredPin = 1234;
            if (enteredPin == pin) {
                System.out.println("Pin verified successfully!");
                break;
            } else {
                attempts--;
                System.out.println("Invalid pin! Attempts left: " + attempts);
            }
        }
        if (attempts == 0) {
            System.out.println("Your card is blocked!");
        }
    }
    

}
