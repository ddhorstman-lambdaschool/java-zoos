package com.davidhorstman.zoo.repositories;

import com.davidhorstman.zoo.models.ZooAnimal;
import com.davidhorstman.zoo.models.ZooAnimalId;
import org.springframework.data.repository.CrudRepository;

public interface ZooAnimalRepository extends CrudRepository<ZooAnimal, ZooAnimalId> {
}
