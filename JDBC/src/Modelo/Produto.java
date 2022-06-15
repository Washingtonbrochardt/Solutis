package Modelo;

public class Produto {
	
	private Integer i;
	private String nome;
	private String descricao;
	
	public Produto(String nome, String descricao) {
		super();

		this.nome = nome;
		this.descricao = descricao;
	}

	public Produto(int int1, String string, String string2) {
		this.i = i;
		this.nome = nome;
		this.descricao = descricao;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
			return String.format("O produto criado foi: %d, %s, %s", this.i, this.nome, this.descricao);
		
	}
	

}
