//header files
  
import java.sql.Connection;                    // connection header file
import java.sql.DriverManager;                // use for sql injectioning
import java.sql.PreparedStatement;           // use for assignation 
import java.util.Scanner;                   //common header file 
 
public class StudentDatabase     
                            {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Collecting user input
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Class: ");
        String className = sc.nextLine();

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dob = sc.nextLine();

        System.out.print("Enter School Name: ");
        String schoolName = sc.nextLine();

        // MySQL Database credentials
        String url = "jdbc:mysql://localhost:3306/studentdb"; // Change db name if needed
        String user = "root";  // your MySQL username
        String password = "your_password";  // your MySQL password

        try {
            // Step 1: Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Step 3: Insert query
            
            String query = "INSERT INTO students (name, class, dob, school_name) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);

            
            pstmt.setString(1, name);
            pstmt.setString(2, className);                        // use moduling in this 
            pstmt.setString(3, dob);
            pstmt.setString(4, schoolName);

            // Step 4: Execute
            int rows = pstmt.executeUpdate();

            if (rows > 0) 
                    {
                System.out.println("Data inserted successfully!");
                    } 
            else
            {
                System.out.println("Failed to insert data.");
            }

            // Step 5: Close connection
            pstmt.close();
            con.close();

        } catch (Exception e) {                        //  it use for error detection
            e.printStackTrace();                        // call the method
        }

        sc.close();
    }
}
