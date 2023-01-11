package br.com.alura.forum.modelo.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.StatusTopico;
import br.com.alura.forum.modelo.Topico;

public class DetalheTopicoDTO extends TopicoDTO {

	private String nomeAutor;
	private StatusTopico status;
	private List<RespostasDTO> respostas;
	
	public DetalheTopicoDTO(Topico topico) {
		super(topico);
		this.nomeAutor = topico.getAutor().getNome();
		this.status = topico.getStatus();
		this.respostas = new ArrayList<>();
		this.respostas.addAll(topico.getRespostas().stream().map(RespostasDTO :: new).collect(Collectors.toList()));
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public StatusTopico getStatus() {
		return status;
	}

	public List<RespostasDTO> getRespostas() {
		return respostas;
	}
	
}
