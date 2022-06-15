package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Factory.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] chuchu) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = connectionFactory.recuperarConexao();

		System.out.println("Fechando conexao");

		con.close();
	}

}
