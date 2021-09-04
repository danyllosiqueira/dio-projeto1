package com.dio.projeto1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.projeto1.model.NivelAcesso;
import com.dio.projeto1.service.NivelAcessoService;


@RestController
@RequestMapping("/NivelAcesso")
public class NivelAcessoController {

	@Autowired
	NivelAcessoService service;
	
	@PostMapping
	public NivelAcesso create(@RequestBody NivelAcesso entidade) {
		return service.save(entidade);
	}
	
	@GetMapping
	public List<NivelAcesso> getList() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<NivelAcesso> getById(@PathVariable("id") long id) throws Exception {
		return ResponseEntity.ok(service.getById(id).orElseThrow(() -> new Exception("nada foi encontrado")));
	}
	
	@PutMapping
	public NivelAcesso update(@RequestBody NivelAcesso entidade) {
		return service.update(entidade);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") long id) throws Exception {
		try {
			service.deleteById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
}
