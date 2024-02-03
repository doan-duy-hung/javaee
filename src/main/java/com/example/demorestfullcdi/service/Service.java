package com.example.demorestfullcdi.service;

import com.example.demorestfullcdi.entity.Employee;
import com.example.demorestfullcdi.entity.Product;
import com.example.demorestfullcdi.repo.EmployeeRepo;
import com.example.demorestfullcdi.repo.ProductRepo;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class Service {

    @Inject
    private Bean1 bean1;

    @Inject
    private EmployeeRepo repo;

    @Inject
    private ProductRepo repoProduct;

    public String getBean(int id) {
        bean1.add();
        Employee e = new Employee();
        e.setId(id);
        e.setName("name " + id);
        repo.save(e);
        return "Test transaction ";
    }

    public String saveProduct(int id) {
        bean1.add();
        Product e = new Product();
        e.setId(id);
        e.setName("name " + id);
        repoProduct.save(e);
        return "Test transaction ";
    }
}
