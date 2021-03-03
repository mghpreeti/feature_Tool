package com.feature.permision.resource;

import java.util.Collection;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



public interface Resource<T> {
	@GetMapping
	public ResponseEntity<Collection<T>> findAll() ;

	@GetMapping("{val}")
	public ResponseEntity<T> findByName(@PathVariable String val) ;

	@PostMapping(consumes =MediaType.APPLICATION_JSON_VALUE) 
	public ResponseEntity<T> save(@RequestBody T t);

	@PutMapping(consumes =MediaType.APPLICATION_JSON_VALUE) 
	public ResponseEntity<T> update(@RequestBody T t) ;
	
	@DeleteMapping("{val}")
	public ResponseEntity<String> deletebyName(@PathVariable String val) ;
}
