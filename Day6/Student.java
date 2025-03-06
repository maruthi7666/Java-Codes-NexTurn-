package Day6;

public class Student {
    String name;
    int rollnum;
    char Grade;
    public Student(String a, int b, char c){
        name=a;
        rollnum=b;
        Grade=c;
    }
    void show(){
        System.out.println(name+" "+rollnum+" "+Grade);
    }
    public static void main(String[] args) {
        Student obj = new Student("ramya",156,'A');
        obj.show();
        
    }
    
}
