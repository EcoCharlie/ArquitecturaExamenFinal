package com.tf1.FinalExamenArquitectura.domain.service;

import com.tf1.FinalExamenArquitectura.domain.entity.Adelanto;

import java.util.Optional;

public interface AdelantoService extends CrudService<Adelanto, Long> {
    Optional<Adelanto> findByUserId(String userId)throws Exception;
}
