package com.davidhorstman.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table("zooanimals")
@IdClass(ZooAnimalId.class)
public class ZooAnimal implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn("zooid")
    @JsonIgnoreProperties(value = "animals", allowSetters = true)
    private Zoo zoo;

    @Id
    @ManyToOne
    @JoinColumn("animalid")
    @JsonIgnoreProperties(value = "zoos", allowSetters = true)
    private Animal animal;

    public ZooAnimal(){}

    public ZooAnimal(Zoo zoo, Animal animal) {
        this.zoo = zoo;
        this.animal = animal;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooAnimal that = (ZooAnimal) o;
        return ((zoo == null) ? 0 : zoo.getZooid()) == ((that.zoo == null) ? 0 : that.zoo.getZooid()) &&
                ((animal == null) ? 0 : animal.getAnimalid()) == ((that.animal == null) ? 0 : that.animal.getAnimalid());
    }

    @Override
    public int hashCode() {
        return 27;
    }
}
