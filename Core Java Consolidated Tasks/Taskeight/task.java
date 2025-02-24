import java.sql.*;
import java.util.Scanner;

public class JdbcOperations {
    
    private static Connection conn;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void connectToDatabase() {
        try {
          
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_db", "username", "password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
 
    public static void insertRows() {
        try {
            String query = "INSERT INTO your_table_name (column1, column2) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            System.out.println("Enter the number of rows to insert:");
            int numRows = scanner.nextInt();
            scanner.nextLine();  
            
            for (int i = 0; i < numRows; i++) {
                System.out.println("Enter data for row " + (i + 1) + ":");
                System.out.print("Enter column1 value: ");
                String col1 = scanner.nextLine();
                System.out.print("Enter column2 value: ");
                String col2 = scanner.nextLine();
                
                stmt.setString(1, col1);
                stmt.setString(2, col2);
                stmt.executeUpdate();
                System.out.println("Row " + (i + 1) + " inserted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void updateRow() {
        try {
            String query = "UPDATE your_table_name SET column1 = ?, column2 = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            System.out.println("Enter the ID of the row to update:");
            int id = scanner.nextInt();
            scanner.nextLine();  
            
            System.out.print("Enter new column1 value: ");
            String newCol1 = scanner.nextLine();
            System.out.print("Enter new column2 value: ");
            String newCol2 = scanner.nextLine();
            
            stmt.setString(1, newCol1);
            stmt.setString(2, newCol2);
            stmt.setInt(3, id);
            
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Row updated successfully.");
            } else {
                System.out.println("No row found with the specified ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteRow() {
        try {
            String query = "DELETE FROM your_table_name WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            System.out.println("Enter the ID of the row to delete:");
            int id = scanner.nextInt();
            
            stmt.setInt(1, id);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Row deleted successfully.");
            } else {
                System.out.println("No row found with the specified ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
        public static void selectRows() {
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
    
    
    public static void main(String[] args) {
        connectToDatabase();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert a new Row");
            System.out.println("2. Update a Row");
            System.out.println("3. Delete a Row");
            System.out.println("4. Select rows");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  
            
            switch (choice) {
                case 1:
                    insertRows();
                    break;
                case 2:
                    updateRow();
                    break;
                case 3:
                    deleteRow();
                    break;
                case 4:
                    selectRows();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    try {
                        conn.close();  
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
