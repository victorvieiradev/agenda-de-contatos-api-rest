package com.mycompany.repositories;

import com.mycompany.model.ContatoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {
    ContatoModel findByNome(String nome);
    List<ContatoModel> findByNomeStartsWith(String nome);
}
