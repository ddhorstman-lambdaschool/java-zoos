package com.davidhorstman.zoo.repositories;

import com.davidhorstman.zoo.models.Phone;
import org.springframework.data.repository.CrudRepository;

public interface PhoneRepository extends CrudRepository<Phone, Long> {
}
