package io.github.theus28238.libaryapi.repositorys;

import io.github.theus28238.libaryapi.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface AutorRepository extends JpaRepository<Autor, UUID> {

}
