package it.itsincom.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "films")
public class Film {

    @Id
    @GeneratedValue
    public Long id;

    @Column(nullable = false)
    public String name;
    public String description;
}
