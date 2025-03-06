import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferEx {
    
    public static void main(String[] args) throws IOException {
        InputStreamReader name = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(name);
        System.out.print("Enter Your Name: ");
        String myname = br.readLine();
        System.out.println("Hello, " + myname + "!");
        
    }
}
