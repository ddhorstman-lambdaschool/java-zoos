package com.davidhorstman.zoo.repositories;

import com.davidhorstman.zoo.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long> {
}
