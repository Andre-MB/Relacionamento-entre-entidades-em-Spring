package br.com.projeto.exemplo01.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "colaboradores")
@Getter
@Setter
public class Colaborador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String nome;

    @OneToOne
    @JoinColumn(name="codigo_cargo", referencedColumnName = "codigo")
    private Cargo cargo;

}
