package Day6;

public class ConstructEx {

    String name;
    int num;


    public ConstructEx(String a, int b){
        name=a;
        num=b;
    }
// constructor method
    // ConstructEx(){
    //     // default constructor
    //     name="mahesh";
    //     num=50;    
    // }
    void show(){
        System.out.println(name+" "+num);
    }
    public static void main(String[] args) {
        ConstructEx obj = new ConstructEx("mahesh",20);
        obj.show();
        

    }
             
}   
    //String name = "mahesh";
    //int num = 50;
    // a constructor is a special method that is used to initialize objects
    // it is called when an object is created
    // it has the same name as the class
    // it does not have a return type
    // it is called only once per object
    // it is used to set initial values for object attributes
    // if you don't define a constructor, Java will automatically provide a default constructor
    // if you define a parameterized constructor, Java will not provide a default constructor
    // if you define a constructor, Java will not provide a no-arg constructor

    // public static void main(String[] args) {
    //     ConstructoEx obj = new ConstructoEx();
    //     System.out.println(obj.name);
    //     System.out.println(obj.num);
    // }
    
//}
