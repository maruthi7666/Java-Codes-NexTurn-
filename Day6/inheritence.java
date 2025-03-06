package day6;
class Student{
    void speak(){
        System.out.println("Student is speaking");
    }

}
class Teacher extends Student{
    void teach(){
        System.out.println("Teacher is teaching");
    }
}
public class inheritence {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.speak();
        t.teach();
    }
    
}