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

//		Ao executar SQL como Statement, temos um risco de seguran�a, chamado de SQL Injection
//		SQL Injection nada mais � do que passar um novo comando SQL como par�metro
//		Para evitar SQL Injection, devemos usar a interface PreparedStatement
//		Diferentemente do Statement, o PreparedStatement trata (sanitiza) cada par�metro do comando SQL
//		
			try (PreparedStatement stm = con.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)",
					Statement.RETURN_GENERATED_KEYS)) {

				adicionarVariavel("Smartv", "Tv Lg", stm);
				adicionarVariavel("Xbox", "Game da Microsoft", stm);
				
//				O banco de dados oferece um recurso chamado de transa��o, para juntar v�rias altera��es como unidade de trabalho
//				Se uma altera��o falha, nenhuma altera��o � aplicada (� feito um rollback da transa��o)
//				Todas as altera��es precisam funcionar para serem aceitas (� feito um commit)
//				commit e rollback s�o opera��es cl�ssicas de transa��es
//				Para garantir o fechamento dos recursos, existe no Java uma cl�usula try-with-resources
//				O recurso em quest�o deve usar a interface Autoclosable
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
			throw new RuntimeException("N�o foi poss�vel adicionar o produto");
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
