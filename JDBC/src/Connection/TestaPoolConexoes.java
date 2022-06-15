package Connection;

import java.sql.Connection;
import java.sql.SQLException;

import Factory.ConnectionFactory;

//� boa pr�tica usar um pool de conex�es
//Um pool de conex�es administra/controla a quantidade de conex�es abertas
//Normalmente tem um m�nimo e m�ximo de conex�es
//Como existe uma interface que representa a conex�o (java.sql.Connection), tamb�m existe uma interface que representa o pool de conex�es (javax.sql.DataSource)
//C3PO � uma implementa��o Java de um pool de conex�o

public class TestaPoolConexoes {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();

		for (int i = 1; i < 20; i++) {

			connectionFactory.recuperarConexao();
			System.out.println("Conexao de numero: "+ i);
		}
	}
}
