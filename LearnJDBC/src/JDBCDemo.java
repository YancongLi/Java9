import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		try {
			// Establish Connection Object
			Connection conn = DriverManager.getConnection(url, "root", "mysqlpassword");

			// Create a statement object to send to the database
			Statement statement = conn.createStatement();

			// Execute the statement object
			ResultSet resultSet = statement.executeQuery("select * from employees_tbl");

			// Process the result

			// while (resultSet.next()) {
			// System.out.println(resultSet.getString("name"));
			// }

			int salaryTotal = 0;
			while (resultSet.next()) {
				salaryTotal += resultSet.getInt("salary");
			}
			System.out.println("Total salary in the employees_tbl is: " + salaryTotal);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
