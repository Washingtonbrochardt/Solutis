package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {

	public static void main(String[] args) throws SQLException {

		try (Connection con = ConnectionFactory.recuperarConexao()) {
			con.setAutoCommit(false);

//		Ao executar SQL como Statement, temos um risco de segurança, chamado de SQL Injection
//		SQL Injection nada mais é do que passar um novo comando SQL como parâmetro
//		Para evitar SQL Injection, devemos usar a interface PreparedStatement
//		Diferentemente do Statement, o PreparedStatement trata (sanitiza) cada parâmetro do comando SQL
//		
			try (PreparedStatement stm = con.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)",
					Statement.RETURN_GENERATED_KEYS)) {

				adicionarVariavel("Smartv", "Tv Lg", stm);
				adicionarVariavel("Xbox", "Game da Microsoft", stm);
				
//				O banco de dados oferece um recurso chamado de transação, para juntar várias alterações como unidade de trabalho
//				Se uma alteração falha, nenhuma alteração é aplicada (é feito um rollback da transação)
//				Todas as alterações precisam funcionar para serem aceitas (é feito um commit)
//				commit e rollback são operações clássicas de transações
//				Para garantir o fechamento dos recursos, existe no Java uma cláusula try-with-resources
//				O recurso em questão deve usar a interface Autoclosable
//				
				con.commit();

			} catch (Exception e) {

				e.printStackTrace();
				System.out.println("Rollback Executado");
				con.rollback();
			}
		}
	}

	private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);

		if (nome.equals("Smartv")) {
			throw new RuntimeException("Não foi possível adicionar o produto");
		}

		stm.execute();

		try (ResultSet rst = stm.getGeneratedKeys()) {

			while (rst.next()) {
				Integer id = rst.getInt(1);
				System.out.println("O id criado foi: " + id);
			}
		}
	}
}
