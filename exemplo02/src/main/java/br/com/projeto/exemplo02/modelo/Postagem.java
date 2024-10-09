package br.com.projeto.exemplo02.modelo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "postagens")
@Getter
@Setter
public class Postagem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String titulo;

    private String texto;

    @OneToMany
    @JoinColumn(name = "codigo_postagem")
    private List<Comentario> comentarios;
}
