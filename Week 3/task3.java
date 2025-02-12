import java.util.*;
import java.io.*;

public class task3 {
    public static void main(String[] args) throws IOException {
        getinputscanner(); // Calling static method directly
        Taskthree obj = new Taskthree(); // Creating object to call non-static method
        obj.getinputbuffer();
    }
  
  void getinputbuffer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number using BufferedReader: ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Input using BufferedReader: " + a);
    }
    static void getinputscanner() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number using Scanner: ");
        int a = s.nextInt();
        System.out.println("Input using Scanner: " + a);
    }

  
}
