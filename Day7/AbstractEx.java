package Day7;

abstract class trainer{
    abstract void teach();
}

class student extends trainer{
    void teach(){
        System.out.println("Trainer is training while brain is braining......");
    }
}

public class AbstractEx {

    public static void main(String[] args) {
        student obj = new student();

        obj.teach();
    }
}
