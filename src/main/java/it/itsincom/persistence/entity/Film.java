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
    public String title;
    public String genre;
    public Number duration;
    public String direction;
    public String description;
    public String poster_url;
    public Number year;
    public String rating;
}
