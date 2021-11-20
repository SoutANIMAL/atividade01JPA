package com.fernando.atividade01JPA.repository;

import com.fernando.atividade01JPA.domain.Acolhido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcolhidoRepository extends JpaRepository<Acolhido, Long> {

}
