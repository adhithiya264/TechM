import java.sql.*;
import java.util.Scanner;

public class CRUDOperations {
    
    private static Connection conn;
    private static Scanner scanner = new Scanner(System.in);

    public static void connectToDatabase() {
        try {
            // Load the driver class (MySQL in this case)
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_db", "username", "password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // CREATE: Insert a new record
    public static void createRecord() {
        try {
            String query = "INSERT INTO your_table_name (column1, column2) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            System.out.print("Enter column1 value: ");
            String col1 = scanner.nextLine();
            System.out.print("Enter column2 value: ");
            String col2 = scanner.nextLine();
            
            stmt.setString(1, col1);
            stmt.setString(2, col2);
            
            stmt.executeUpdate();
            System.out.println("Record inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ: Fetch records from the table
    public static void readRecords() {
        try {
            String query = "SELECT * FROM your_table_name";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String col1 = rs.getString("column1");
                String col2 = rs.getString("column2");
                System.out.println("ID: " + id + ", Column1: " + col1 + ", Column2: " + col2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE: Update a record based on ID
    public static void updateRecord() {
        try {
            String query = "UPDATE your_table_name SET column1 = ?, column2 = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            System.out.print("Enter record ID to update: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Enter new value for column1: ");
            String col1 = scanner.nextLine();
            System.out.print("Enter new value for column2: ");
            String col2 = scanner.nextLine();
            
            stmt.setString(1, col1);
            stmt.setString(2, col2);
            stmt.setInt(3, id);
            
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully.");
            } else {
                System.out.println("No record found with the given ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE: Delete a record based on ID
    public static void deleteRecord() {
        try {
            String query = "DELETE FROM your_table_name WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            System.out.print("Enter record ID to delete: ");
            int id = scanner.nextInt();
            
            stmt.setInt(1, id);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("No record found with the given ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        connectToDatabase();

        // Menu for CRUD operations
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a new record");
            System.out.println("2. Read records");
            System.out.println("3. Update a record");
            System.out.println("4. Delete a record");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    createRecord();
                    break;
                case 2:
                    readRecords();
                    break;
                case 3:
                    updateRecord();
                    break;
                case 4:
                    deleteRecord();
                    break;
                case 5:
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
