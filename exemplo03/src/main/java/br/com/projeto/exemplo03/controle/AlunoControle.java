package br.com.projeto.exemplo03.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo03.modelo.Aluno;
import br.com.projeto.exemplo03.repositorio.AlunoRepositorio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/aluno")
public class AlunoControle {
    
    @Autowired
    private AlunoRepositorio alunoRepositorio;

    @GetMapping("/listar")
    public Iterable <Aluno> listar(){
        return alunoRepositorio.findAll();
    }
    
}
