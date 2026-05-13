package it.itsincom.web;

import java.util.List;

import it.itsincom.persistence.entity.Film;
import it.itsincom.persistence.repository.FilmRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/films")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
// @RolesAllowed("user")
public class FilmResource {

    @Inject
    FilmRepository filmRepository; 
    
    @GET
    public List<Film> list() {
        return filmRepository.listAll();
    }

    @GET
    @Path("/{id}")
    public Film get(@PathParam("id") Long id) {
        return filmRepository.findById(id);
    }
}
