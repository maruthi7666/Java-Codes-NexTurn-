package Day5;

public class Emailex {
    public static void sendemail(String name,String company) {
        String emaildraft="dear" + name + "welcome to" + company + "!";
        System.out.println(emaildraft);
    }
    public static void main(String[] args) {
        sendemail("mahesh","kpmg");


    }
    
}
