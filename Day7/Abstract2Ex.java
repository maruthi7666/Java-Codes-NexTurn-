package Day7;

abstract class DataBase{
    abstract void connecting();
    void disconnecting(){
        System.out.println("Disconnected");
    }

}
class Mydata extends DataBase{
    void connecting(){
        System.out.println("Connected to Database");
    }
}

public class Abstract2Ex {
    public static void main(String[] args) {
        Mydata db=new Mydata();
        db.connecting();
    }
    
}
