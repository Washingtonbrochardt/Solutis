package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Para simplificar e encapsular a cria��o da conex�o, devemos usar uma classe ConnectionFactory
//A classe ConnectionFactory segue o padr�o de cria��o Factory Method
//O Factory Method encapsula a cria��o de um objeto


public class ConnectionFactory {
	
	public static Connection recuperarConexao() throws SQLException{
		return  DriverManager
					.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC","root","root");
		
	}

}
