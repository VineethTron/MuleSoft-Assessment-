import java.sql.*;

public class CreateTable {
	public static void main(String[] args) {

		try {

			Connection con = null; 		// Create Connection
			Statement stmt = null; 		//Declare Statement & Initialize with null

			con = DriverManager			//Connect to DataBase
					.getConnection("jdbc:sqlite:/C:\\Users\\VineethThummanapally\\Desktop\\MuleSoft\\Movies.db");

			System.out.println("Database Connection Successful !!");

			stmt = con.createStatement(); //Create Statement

			String qry = "CREATE TABLE MoviesTable " + "(MovieName TEXT NOT NULL," + " DirectorName TEXT NOT NULL, "    //CreateQuery
					+ " LeadActor TEXT NOT NULL, " + " LeadActress TEXT NOT NULL, " + " ReleaseYEAR INTEGER NOT NULL)";

			stmt.executeUpdate(qry); 	//Execute Query
			
			stmt.close();				//Close Statement
			con.close();				//Close Connection
		} catch (Exception e) {	
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Table Created successfully!!!!");
	}
}