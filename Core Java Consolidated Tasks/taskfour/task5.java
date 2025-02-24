import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

   
    public static class EmptyFileException extends Exception {
        public EmptyFileException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
       
        if (args.length != 1) {
            System.out.println("Please provide a file name.");
            return;
        }

        String fileName = args[0];

        try {
     
            checkFileEmpty(fileName);
            System.out.println("File is not empty, reading content...");
            
        } catch (EmptyFileException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static void checkFileEmpty(String fileName) throws EmptyFileException, IOException {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
         
            if (line == null || line.trim().isEmpty()) {
                throw new EmptyFileException("The file is empty.");
            }
            while ((line = reader.readLine()) != null) {
                
                System.out.println(line);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
