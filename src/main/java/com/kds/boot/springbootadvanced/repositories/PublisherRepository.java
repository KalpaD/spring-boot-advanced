package com.kds.boot.springbootadvanced.repositories;

import com.kds.boot.springbootadvanced.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kalpasenanayake on 11/8/17.
 */
@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
