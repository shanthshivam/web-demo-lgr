package com.webdemo.accessingdatamysql;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MarksRepository extends CrudRepository<Marks, String> {
	
	public Marks findByEmail(String email);

}