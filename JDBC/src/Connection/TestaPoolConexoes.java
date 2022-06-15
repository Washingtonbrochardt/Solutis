package Connection;

import java.sql.Connection;
import java.sql.SQLException;

import Factory.ConnectionFactory;

//É boa prática usar um pool de conexões
//Um pool de conexões administra/controla a quantidade de conexões abertas
//Normalmente tem um mínimo e máximo de conexões
//Como existe uma interface que representa a conexão (java.sql.Connection), também existe uma interface que representa o pool de conexões (javax.sql.DataSource)
//C3PO é uma implementação Java de um pool de conexão

public class TestaPoolConexoes {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();

		for (int i = 1; i < 20; i++) {

			connectionFactory.recuperarConexao();
			System.out.println("Conexao de numero: "+ i);
		}
	}
}
