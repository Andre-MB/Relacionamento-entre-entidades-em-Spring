package br.com.projeto.exemplo01.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo01.modelo.Colaborador;
import br.com.projeto.exemplo01.repositorio.ColaboradorRepositorio;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorControle {
    
    @Autowired
    private ColaboradorRepositorio colaborador_repositorio;

    @GetMapping("/listar")
    public Iterable<Colaborador> listar() {
        return colaborador_repositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Colaborador cadastrar(@RequestBody Colaborador obj) {
        return colaborador_repositorio.save(obj);
    }
}
