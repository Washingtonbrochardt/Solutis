package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Para simplificar e encapsular a criação da conexão, devemos usar uma classe ConnectionFactory
//A classe ConnectionFactory segue o padrão de criação Factory Method
//O Factory Method encapsula a criação de um objeto


public class ConnectionFactory {
	
	public static Connection recuperarConexao() throws SQLException{
		return  DriverManager
					.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC","root","root");
		
	}

}
