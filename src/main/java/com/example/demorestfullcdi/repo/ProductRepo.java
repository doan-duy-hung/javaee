package com.example.demorestfullcdi.repo;

import com.example.demorestfullcdi.entity.Product;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class ProductRepo {

    @PersistenceContext(unitName = "default")
    EntityManager entityManager;

    public void save(Product e) {
        entityManager.persist(e);
    }
}
