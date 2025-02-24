import java.io.File;

public class CheckFileOrDirectory {

    public static void main(String[] args) {
      
        String path = "path/to/your/file_or_directory";
        
        File file = new File(path);
      
        if (file.exists()) {
     
            if (file.isFile()) {
                System.out.println("The specified path is a file.");
            } else if (file.isDirectory()) {
                System.out.println("The specified path is a directory.");
            }
        } else {
            System.out.println("The specified path does not exist.");
        }
    }
}
