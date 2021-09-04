package com.dio.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.projeto1.model.Calendario;

public interface CalendarioRepository extends JpaRepository<Calendario, Long>{

}