package com.alura.forum.controller.form;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.alura.forum.modelo.Topico;
import com.alura.forum.repository.TopicoRepository;

public class AtualizarTopicoForm {

	@NotBlank
	@Length(min = 5)
	private String titulo;

	@NotBlank
	@Length(min = 10)
	private String mensagem;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Topico atualizar(Long id, TopicoRepository topicoRepository) {
	    Topico topico = topicoRepository.getReferenceById(id);

	        topico.setTitulo(this.titulo);
	        topico.setMensagem(this.mensagem);

	        return topico;
	}
	
	
}
