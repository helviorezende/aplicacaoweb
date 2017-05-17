package org.wpattern.spring.oauth2.utils;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public abstract class BaseResourceImpl<T extends BaseEntity<K>, K extends Serializable> {
	
	@Autowired
	private JpaRepository<T, K> repository;

	@GetMapping
	public List<T> findAll() {
		return repository.findAll();
	}

	@PostMapping
	public T add(@RequestBody T entityObject) {
		return repository.save(entityObject);
	}
	
	@PutMapping
	public ResponseEntity<T> update(
			@RequestBody T entityObject) {
        if (entityObject.getId() == null) {
            return new ResponseEntity<T>(
            	HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<T>(
            repository.save(entityObject), HttpStatus.OK);
        }
    }
	
	@DeleteMapping
	public void delete(@RequestBody T entityObject){
		repository.delete(entityObject);
	}
	
	@DeleteMapping("/{id:[0-9.,]*$}")
	public void delete(@PathVariable(value = "id") K id){
		repository.delete(id);
	}
}
