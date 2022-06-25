import java.sql.*;

public class InsertMoviesData {

	public static void main(String[] args) {
		try {

			Connection con = null; 		// Create Connection
			Statement stmt = null; 		//Declare Statement & Initialize with null

			con = DriverManager			//Connect to DataBase
					.getConnection("jdbc:sqlite:/C:\\Users\\VineethThummanapally\\Desktop\\MuleSoft\\Movies.db");

			System.out.println("Database Connection Successful !!");

			stmt = con.createStatement(); // Create Statement

			String query1 = "INSERT INTO MoviesTable values ('Interstellar','C Nolan','M Mcconaughey','A Hathaway ',2014);";
			stmt.executeUpdate(query1); // Create Query-1

			String query2 = "INSERT INTO MoviesTable values ('Ready Player One','S Speilberg','T Sheridan','O Cookie',2018);";
			stmt.executeUpdate(query2); // Create Query-2

			String query3 = "INSERT INTO MoviesTable values ('The Shawshank Redemption','Deborah Aquila','Tim Robbins','R Blaine',1994);";
			stmt.executeUpdate(query3); // Create Query-3

			String query4 = "INSERT INTO MoviesTable values ('Avatar','James Cameroon','S Worthington',' Zoe Saldana',2009);";
			stmt.executeUpdate(query4); // Create Query-4

			String query5 = "INSERT INTO MoviesTable values ('Into the Wild','Francine Maisler','E Hirsch','K Stewart',2007);";
			stmt.executeUpdate(query5); // Create Query-5

			stmt.close();

			con.close(); 				//Close Connection
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Data  Insertion successful!!");
	}
}