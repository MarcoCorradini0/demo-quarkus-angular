package it.itsincom.persistence.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import it.itsincom.persistence.entity.Film;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FilmRepository implements PanacheRepository<Film> {
    
}
