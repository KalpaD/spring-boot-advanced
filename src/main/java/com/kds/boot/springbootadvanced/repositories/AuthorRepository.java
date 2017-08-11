package com.kds.boot.springbootadvanced.repositories;

import com.kds.boot.springbootadvanced.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kalpasenanayake on 11/8/17.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
