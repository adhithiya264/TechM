import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileToByteArray {

    public static void main(String[] args) {
     
        String filePath = "path/to/your/file"; 
       
        File file = new File(filePath);
       
        if (file.exists() && file.isFile()) {
            try {
               
                FileInputStream fis = new FileInputStream(file);
                
                long fileLength = file.length();
              
                byte[] fileBytes = new byte[(int) fileLength];
               
                int bytesRead = fis.read(fileBytes);
             
                if (bytesRead == fileLength) {
                    System.out.println("File contents successfully read into a byte array.");
                }
              
                System.out.println("File content in byte array: ");
                for (byte b : fileBytes) {
                    System.out.print(b + " ");
                }
                System.out.println();
  
                fis.close();

            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }
        } else {
            System.out.println("The specified file does not exist.");
        }
    }
}
