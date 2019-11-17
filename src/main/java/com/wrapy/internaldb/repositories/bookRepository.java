package com.wrapy.internaldb.repositories;

import com.wrapy.internaldb.Models.Book;
import org.springframework.data.repository.CrudRepository;

public interface bookRepository extends CrudRepository<Book, Long> {

}
