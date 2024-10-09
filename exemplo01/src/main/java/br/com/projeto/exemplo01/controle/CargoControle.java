package br.com.projeto.exemplo01.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo01.modelo.Cargo;
import br.com.projeto.exemplo01.repositorio.CargoRepositorio;

@RestController
@RequestMapping("/cargos")
public class CargoControle {
    
    @Autowired
    private CargoRepositorio cargo_repositorio;

    @GetMapping("/listar")
    public Iterable<Cargo> listar() {
        return cargo_repositorio.findAll();
    }
    
    @PostMapping("/cadastrar")
    public Cargo cadastro(@RequestBody Cargo obj) {
        return cargo_repositorio.save(obj);
    }
}
