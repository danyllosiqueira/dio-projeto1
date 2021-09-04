package com.dio.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.projeto1.model.BancoHoras;


public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long>{

}
