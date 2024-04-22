package com.codegym.demomvc3.service;

import java.util.List;

public interface IService<E> {
    void add(E e);
    void delete(int id);
    void edit(int id, E e);
    List<E> findAll();
    int findIndexById(int id);
    E findById(int id);
}
