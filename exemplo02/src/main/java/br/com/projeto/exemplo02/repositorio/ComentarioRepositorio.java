package br.com.projeto.exemplo02.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo02.modelo.Comentario;

@Repository
public interface ComentarioRepositorio extends CrudRepository<Comentario, Long> {

}
