package com.dio.projeto1.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public class ServiceBase<R extends JpaRepository<E, Long>, E> {
    
    @Autowired
    R repository;
    
    public E save(E entidade) {
        return repository.save(entidade);
    }
    
    public List<E> findAll() {
        return repository.findAll();
    }
    
    public Optional<E> getById(Long id) {
        return repository.findById(id);
    }
    
    public E update(E entidade) {
        return repository.save(entidade);
    }
    
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
