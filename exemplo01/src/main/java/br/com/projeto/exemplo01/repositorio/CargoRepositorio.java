package br.com.projeto.exemplo01.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo01.modelo.Cargo;

@Repository
public interface CargoRepositorio extends CrudRepository<Cargo, Long> {
    
}
