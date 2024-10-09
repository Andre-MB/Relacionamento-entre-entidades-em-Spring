package br.com.projeto.exemplo02.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo02.modelo.Postagem;

@Repository
public interface PostagemRepositorio extends CrudRepository<Postagem, Long> {

    List<Postagem> findByCodigo(Long codigo);

    List<Postagem> findByTitulo(String titulo);
    
}
