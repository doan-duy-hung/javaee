package com.example.demorestfullcdi.repo;

import com.example.demorestfullcdi.entity.Employee;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class EmployeeRepo {

    @PersistenceContext(unitName = "default")
    EntityManager entityManager;

    public void save(Employee e) {
        entityManager.persist(e);
    }
}
