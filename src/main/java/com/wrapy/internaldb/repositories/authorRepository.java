package com.wrapy.internaldb.repositories;

import com.wrapy.internaldb.Models.Author;
import org.springframework.data.repository.CrudRepository;

public interface authorRepository extends CrudRepository<Author, Integer> {
}
