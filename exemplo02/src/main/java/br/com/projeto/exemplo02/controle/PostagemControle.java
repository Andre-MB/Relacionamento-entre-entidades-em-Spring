package br.com.projeto.exemplo02.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo02.modelo.Postagem;
import br.com.projeto.exemplo02.repositorio.PostagemRepositorio;

@RestController
@RequestMapping("/postagens")
public class PostagemControle {
    
    @Autowired
    private PostagemRepositorio postagem_repositorio;

    @GetMapping("/listar")
    public Iterable<Postagem> listar() {
        return postagem_repositorio.findAll();
    }

    @GetMapping("/listar/codigo/{codigo}")
    public Iterable<Postagem> listarPeloCodigo(@PathVariable long codigo) {
        return postagem_repositorio.findByCodigo(codigo);
    }

    @GetMapping("/listar/titulo/{titulo}")
    public Iterable<Postagem> listarPeloTitulo(@PathVariable String titulo) {
        return postagem_repositorio.findByTitulo(titulo);
    }

    @PostMapping("/cadastrar")
    public Postagem cadastrar(@RequestBody Postagem obj) {
        return postagem_repositorio.save(obj);
    }
}
