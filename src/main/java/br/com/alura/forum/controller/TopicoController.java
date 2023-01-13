package br.com.alura.forum.controller;

import java.net.URI;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.modelo.dto.AtualizaTopicoDTO;
import br.com.alura.forum.modelo.dto.DetalheTopicoDTO;
import br.com.alura.forum.modelo.dto.TopicoCadastroDTO;
import br.com.alura.forum.modelo.dto.TopicoDTO;
import br.com.alura.forum.repository.CursoRepository;
import br.com.alura.forum.repository.TopicoRepository;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

	@Autowired
	private TopicoRepository topicoRepository;

	@Autowired
	private CursoRepository cursoRepository;

	@GetMapping
	@Cacheable(value = "listaTopicos")
	public ResponseEntity<Page<TopicoDTO>> lista(@PageableDefault(
			page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable paginacao) {
		
		Page<Topico> topicos = topicoRepository.findAll(paginacao);
		if (!(Objects.isNull(topicos) || topicos.isEmpty())) {
			return ResponseEntity.ok(TopicoDTO.listar(topicos));
		}
		return ResponseEntity.noContent().build();
	}

	@GetMapping("detalhe/{nomeCurso}")
	public ResponseEntity<Page<TopicoDTO>> bucaTopicoPeloCurso(@PathVariable String nomeCurso, 
			@RequestParam int pagina, @RequestParam int qtd) {
		
		Pageable paginacao = PageRequest.of(pagina, qtd);
		
		Page<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso, paginacao);

		if (!(Objects.isNull(topicos) || topicos.isEmpty())) {
			return ResponseEntity.ok(TopicoDTO.listar(topicos));
		}
		return ResponseEntity.noContent().build();
	}

	@PostMapping
	@Transactional
	@CacheEvict(value = "listaTopicos", allEntries = true)
	public ResponseEntity<TopicoDTO> cadastrar(@RequestBody @Valid TopicoCadastroDTO topicoCadastroDTO,
			UriComponentsBuilder uriBuilder) {
		Topico topico = topicoCadastroDTO.converter(cursoRepository);
		topicoRepository.save(topico);

		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
		return ResponseEntity.created(uri).body(new TopicoDTO(topico));
	}

	@GetMapping("/{id}")
	public ResponseEntity<DetalheTopicoDTO> detalhar(@PathVariable Long id) {
		Optional<Topico> topico = topicoRepository.findById(id);

		if (topico.isPresent()) {
			return ResponseEntity.ok(new DetalheTopicoDTO(topico.get()));
		}
		return ResponseEntity.notFound().build();
	}

	@PutMapping("/{id}")
	@Transactional
	@CacheEvict(value = "listaTopicos", allEntries = true)
	public ResponseEntity<TopicoDTO> atualizar(@PathVariable Long id,
			@RequestBody @Valid AtualizaTopicoDTO atualizarTopicoDTO) {
		Optional<Topico> optional = topicoRepository.findById(id);

		if (optional.isPresent()) {
			Topico topico = atualizarTopicoDTO.atualizar(id, topicoRepository);
			return ResponseEntity.ok(new TopicoDTO(topico));
		}
		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	@Transactional
	@CacheEvict(value = "listaTopicos", allEntries = true)
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		Optional<Topico> optional = topicoRepository.findById(id);

		if (optional.isPresent()) {
			topicoRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}

}
