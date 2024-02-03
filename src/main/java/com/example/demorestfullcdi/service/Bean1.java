package com.example.demorestfullcdi.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class Bean1 {
    @Inject
    private Bean2 bean2;

    public void add() {
        System.out.println("add bean 1 ");
        try {
            bean2.trigger();
        } catch (Exception e) {
            System.out.println("exception" + e.getMessage());
        }
    }

    public void getInfo() {
        System.out.println("info bean 1");
    }

    @PostConstruct
    private void init() {
        System.out.println("init bean 1");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("destroy bean 1");
    }
}
