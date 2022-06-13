package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main (String[] chuchu) throws SQLException{
	
	Connection con = ConnectionFactory.recuperarConexao();

	System.out.println("Fechando conexao");
	
	con.close();
	}
	
}
