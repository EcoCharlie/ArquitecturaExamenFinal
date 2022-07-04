package com.tf1.FinalExamenArquitectura.service;

import com.tf1.FinalExamenArquitectura.domain.entity.Adelanto;
import com.tf1.FinalExamenArquitectura.domain.persistence.AdelantoRepository;
import com.tf1.FinalExamenArquitectura.domain.service.AdelantoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
public class AdelantoServiceImp implements AdelantoService {

    @Autowired
    private AdelantoRepository adelantoRepository;

    @Transactional
    @Override
    public Adelanto save(Adelanto entity) throws Exception {
        return adelantoRepository.save(entity);
    }

    @Transactional
    @Override
    public List<Adelanto> findAll() throws Exception {
        return adelantoRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Adelanto> findById(Long aLong) throws Exception {
        return adelantoRepository.findById(aLong);
    }

    @Transactional
    @Override
    public Adelanto update(Adelanto entity) throws Exception {
        return adelantoRepository.save(entity);
    }

    @Transactional
    @Override
    public void deleteById(Long aLong) throws Exception {
        adelantoRepository.deleteById(aLong);
    }

    @Transactional
    @Override
    public Optional<Adelanto> findByUserId(String userId) throws Exception {
        return adelantoRepository.findByUserId(userId);
    }
}
