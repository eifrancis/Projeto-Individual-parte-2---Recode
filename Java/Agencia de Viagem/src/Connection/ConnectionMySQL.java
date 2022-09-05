package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMySQL {
	public static Connection createConnectionMySQL() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro?user=root&password=");
				
		return Connection;	
		
	}
	
	public static void main(String[] args) throws Exception{
		
		Connection con = createConnectionMySQL();
		
		if (con != null) {
			System.out.println(con +"\n****Conexão bem sucedida****\n");
			con.close();
		}
	}
	
}
