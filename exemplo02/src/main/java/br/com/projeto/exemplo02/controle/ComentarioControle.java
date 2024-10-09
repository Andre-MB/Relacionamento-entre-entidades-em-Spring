package br.com.projeto.exemplo02.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo02.modelo.Comentario;
import br.com.projeto.exemplo02.repositorio.ComentarioRepositorio;

@RestController
@RequestMapping("/comentarios")
public class ComentarioControle {
    
    @Autowired
    private ComentarioRepositorio comentario_repositorio;

    @GetMapping("/listar")
    public Iterable<Comentario> listar() {
        return comentario_repositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Comentario cadastrar(@RequestBody Comentario obj) {
        return comentario_repositorio.save(obj);
    }
}
