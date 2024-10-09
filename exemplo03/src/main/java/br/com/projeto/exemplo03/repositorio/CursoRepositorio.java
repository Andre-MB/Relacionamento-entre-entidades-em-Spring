package br.com.projeto.exemplo03.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo03.modelo.Curso;

@Repository
public interface CursoRepositorio extends CrudRepository<Curso,Long> {
    
}
