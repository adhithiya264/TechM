import java.io.File;

public class CheckFileOrDirectoryExistence {

    public static void main(String[] args) {
        // Specify the path of the file or directory
        String path = "path/to/your/file_or_directory";  // Replace with the actual file or directory path
        
        // Create a File object with the given path
        File file = new File(path);

        // Check if the file or directory exists
        if (file.exists()) {
            // Check if it's a file or directory
            if (file.isFile()) {
                System.out.println("The specified path is a file and it exists.");
            } else if (file.isDirectory()) {
                System.out.println("The specified path is a directory and it exists.");
            }
        } else {
            System.out.println("The specified file or directory does not exist.");
        }
    }
}
