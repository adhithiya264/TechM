import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadNumbersAndThrowException {

    public static void readNumbersFromFile(String filePath) throws Exception {
     
        File file = new File(filePath);

      
        if (!file.exists()) {
            throw new FileNotFoundException("The file at " + filePath + " was not found.");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line.trim()); 

                   
                    if (number > 0) {
                        throw new Exception("Exception: The number " + number + " is positive!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid number: " + line); 
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "path/to/your/numbers.txt"; 

        try {
          
            readNumbersFromFile(filePath);
        } catch (Exception e) {
        
            System.out.println(e.getMessage());
        }
    }
}
