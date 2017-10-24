package com.kds.boot.springbootadvanced.repositories;

import com.kds.boot.springbootadvanced.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kalpasenanayake on 11/8/17.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
