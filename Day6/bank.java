package Day6;

public class bank {
    String AccountHolder;
    int AccountNumber;
    float Balance;

    bank(String AccountHolder,int AccountNumber, float Balance){
        this.AccountHolder=AccountHolder;
        this.AccountNumber=AccountNumber;
        this.Balance=Balance;
    }
    void display(){
        System.out.println("AccountHolder :"+AccountHolder);
        System.out.println("AccountNumber :"+AccountNumber);
        System.out.println("Balance:"+ Balance);
    }
    void deposit(float number){
        Balance=Balance+number;
        System.out.println("Balance after deposit :"+ Balance);
    }

    void withdraw(float number){
        if (number>Balance){
            System.out.println("Insufficient Balance");  
        }
        else {
            Balance=Balance-number;
            System.out.println(" Balance after withdraw:" +Balance);
        }

    }   
    public static void main(String[] args) {
            bank obj = new bank ("Mahesh",521250,10000);
            obj.display();
            obj.deposit(2000);
            System.out.println("Withdrawl amount:"+number);
        obj.withdraw(1500);


        
    }

    
}
