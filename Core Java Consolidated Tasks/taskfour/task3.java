import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileAndThrowException {
  
    public static void readFile(String filePath) throws FileNotFoundException {
        
        File file = new File(filePath);
     
        if (!file.exists()) {
            throw new FileNotFoundException("The file at " + filePath + " was not found.");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
         
            while ((line = br.readLine()) != null) {
                System.out.println(line);  
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";  

        try {
            
            readFile(filePath);
        } catch (FileNotFoundException e) {
           
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
