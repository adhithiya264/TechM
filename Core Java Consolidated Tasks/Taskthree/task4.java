import java.io.File;

public class CheckFilePermissions {

    public static void main(String[] args) {
        // Specify the path of the file or directory
        String path = "path/to/your/file_or_directory";  // Replace with the actual file or directory path
        
        // Create a File object with the given path
        File file = new File(path);

        // Check if the file or directory exists
        if (file.exists()) {
            // Check if the file has read and write permissions
            boolean canRead = file.canRead();
            boolean canWrite = file.canWrite();

            // Print the permissions
            System.out.println("File or Directory: " + path);
            System.out.println("Read permission: " + (canRead ? "Granted" : "Denied"));
            System.out.println("Write permission: " + (canWrite ? "Granted" : "Denied"));
        } else {
            System.out.println("The specified file or directory does not exist.");
        }
    }
}
