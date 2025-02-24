import java.io.File;

public class FileSize {

    public static void main(String[] args) {
     
        String filePath = "path/to/your/file";  
    
        File file = new File(filePath);

        if (file.exists()) {

            long fileSizeInBytes = file.length();

            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;

            System.out.println("File size in bytes: " + fileSizeInBytes + " bytes");
            System.out.println("File size in kilobytes: " + String.format("%.2f", fileSizeInKB) + " KB");
            System.out.println("File size in megabytes: " + String.format("%.2f", fileSizeInMB) + " MB");
        } else {
            System.out.println("The specified file does not exist.");
        }
    }
}
