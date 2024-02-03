package com.example.demorestfullcdi.resource;

import com.example.demorestfullcdi.service.Service;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/")
public class HelloResource {

    @Inject
    private Service service;

    @PersistenceContext(unitName="default")
    EntityManager entityManager;

    @GET
    @Produces("text/plain")
    public String hello() {
        entityManager.clear();
        return "hello";
    }

    @GET
    @Path("/test/{id}")
    @Produces("text/plain")
    public String test(@PathParam("id") int id) {
        return service.getBean(id);
    }

    @GET
    @Path("/test2/{id}")
    @Produces("text/plain")
    public String test2(@PathParam("id") int id) {
        return service.saveProduct(id);
    }
}