package br.edu.iftm.igrejasonline.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.igrejasonline.domain.Entidade;
import br.edu.iftm.igrejasonline.services.EntidadeService;

@RestController
@RequestMapping(value = "/entidades")

public class EntidadeResource {

	@Autowired
	private EntidadeService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Entidade> find(@PathVariable Integer id) {
		Entidade obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}


	@RequestMapping(method = RequestMethod.GET)
	public List<Entidade> listar() {

		Entidade ent1 = new Entidade(1, "Mocidade", "999085674");
		Entidade ent2 = new Entidade(2, "Demolays", "987109689");

		List<Entidade> lista = new ArrayList<>();
		lista.add(ent1);
		lista.add(ent2);

		return lista;
	}
}