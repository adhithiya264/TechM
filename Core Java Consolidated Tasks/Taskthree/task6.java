import java.io.File;
import java.text.SimpleDateFormat;

public class LastModifiedDate {

    public static void main(String[] args) {
      String filePath = "path/to/your/file"; 

        File file = new File(filePath);

        if (file.exists()) {
    
            long lastModified = file.lastModified();
          
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = sdf.format(lastModified);

            System.out.println("The last modified date of the file is: " + formattedDate);
        } else {
            System.out.println("The specified file does not exist.");
        }
    }
}
