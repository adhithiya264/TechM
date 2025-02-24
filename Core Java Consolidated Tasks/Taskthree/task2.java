import java.io.File;
import java.io.FilenameFilter;

public class ListFilesWithExtension {

    public static void main(String[] args) {
     
        String directoryPath = "path/to/your/directory"; 
        String fileExtension = ".txt"; 

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
          
            FilenameFilter filter = (dir, name) -> name.toLowerCase().endsWith(fileExtension.toLowerCase());

            String[] files = directory.list(filter);
        
            if (files != null && files.length > 0) {
                System.out.println("Files with extension " + fileExtension + " in " + directoryPath + ":");
               
                for (String fileName : files) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("No files with extension " + fileExtension + " found.");
            }
        } else {
            System.out.println("The directory does not exist or is not a valid directory.");
        }
    }
}
