package com.example.demorestfullcdi.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.Stateless;
import jakarta.ejb.TransactionAttribute;
import jakarta.ejb.TransactionAttributeType;
import jakarta.transaction.Transactional;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class Bean2 {
    public void add() {
        System.out.println("add bean 2");
    }

    public void getInfo() {
        System.out.println("info bean 2");
    }

    @Transactional
    public void trigger() {
        throw new RuntimeException("error");
    }

    @PostConstruct
    private void init() {
        System.out.println("init bean 2");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("destroy bean 2");
    }
}
