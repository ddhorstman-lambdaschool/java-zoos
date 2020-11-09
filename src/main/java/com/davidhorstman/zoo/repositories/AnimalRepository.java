package com.davidhorstman.zoo.repositories;

import com.davidhorstman.zoo.models.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
