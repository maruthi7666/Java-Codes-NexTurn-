package Day6;

public class Book {
    String Title;
    String Author;
    float Price;
    public Book(String a, String b, float c){
        Title=a;
        Author=b;
        Price=c;
    }
    Book(Book original){
        Title=original.Title;
        Author=original.Author;
        Price=original.Price;



    }
    void show(){
        System.out.println(Title+" "+Author+" "+Price);
    }
    public static void main(String[] args) {
        System.out.println("this is original book");
        Book obj = new Book("Java Programming","James Gosling",30.5f);
        obj.show();
        System.out.println("this is copied book");
        Book obj2=new Book(obj);
        obj2.show();
        
    }
}
