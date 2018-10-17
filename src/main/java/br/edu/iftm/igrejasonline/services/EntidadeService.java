package br.edu.iftm.igrejasonline.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iftm.igrejasonline.domain.Entidade;
import br.edu.iftm.igrejasonline.repositories.EntidadeRepository;
import br.edu.iftm.igrejasonline.services.exceptions.ObjectNotFoundException;


@Service
public class EntidadeService {

	@Autowired
	private EntidadeRepository repo;
	
	public Entidade find(Integer id) {
		Optional<Entidade> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Entidade.class.getName()));
	}
	
}
