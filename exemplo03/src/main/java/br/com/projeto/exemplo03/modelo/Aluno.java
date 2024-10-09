package br.com.projeto.exemplo03.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "alunos")
@Getter
@Setter
public class Aluno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String aluno;

    @ManyToMany
    @JoinTable(
        name = "inte_Alunos_Curso",
        joinColumns = {@JoinColumn(name="codigo_aluno", referencedColumnName = "codigo")},
        inverseJoinColumns = {@JoinColumn(name="codigo_curso", referencedColumnName = "codigo")}
    )
    private List<Curso> cursos = new ArrayList<>();
}
