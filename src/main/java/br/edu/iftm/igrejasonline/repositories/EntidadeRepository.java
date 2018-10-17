package br.edu.iftm.igrejasonline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.iftm.igrejasonline.domain.Entidade;

@Repository
public interface EntidadeRepository extends JpaRepository<Entidade, Integer> {
	


}
