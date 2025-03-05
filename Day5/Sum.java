package Day5;
public class Sum{
    public static void main(String args[]){
       int my_input = 12131415;
       System.out.println("The number is defined as : " +my_input);
       int my_result = digitSum(my_input);
       System.out.println("The Sum of digits of " + my_input + " is " + my_result);
    }
    static int digitSum(int n){
       if (n == 0)
          return 0;
       return (n % 10 + digitSum(n / 10));
    }
 }