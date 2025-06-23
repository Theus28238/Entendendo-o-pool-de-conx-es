package io.github.theus28238.libaryapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "autor", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autor {
    @Id
    @Column(name = "id") //tem que ser o nome igual o da tabela
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome", length = 100, nullable = false)

    private String nome;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "nacionalidade", length = 50, nullable = false)
    private String nacionalidade;
}
