import java.io.File;

public class ListFilesAndDirectories {

    public static void main(String[] args) {
        
        String directoryPath = "path/to/your/directory";  
       
        File directory = new File(directoryPath);
        
        if (directory.exists() && directory.isDirectory()) {

            String[] files = directory.list();
  
            if (files != null && files.length > 0) {
                System.out.println("Files and directories in " + directoryPath + ":");
                
                for (String fileName : files) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The directory does not exist or is not a valid directory.");
        }
    }
}
