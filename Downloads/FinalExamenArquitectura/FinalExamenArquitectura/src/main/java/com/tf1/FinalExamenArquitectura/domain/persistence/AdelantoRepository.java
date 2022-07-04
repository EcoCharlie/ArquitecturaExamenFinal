package com.tf1.FinalExamenArquitectura.domain.persistence;

import com.tf1.FinalExamenArquitectura.domain.entity.Adelanto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdelantoRepository extends JpaRepository<Adelanto, Long> {
    Optional<Adelanto> findByUserId(String userId);
}
