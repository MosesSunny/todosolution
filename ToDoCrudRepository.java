package com.ncr.todo.repository;

import org.springframework.data.repository.CrudRepository;

import com.ncr.todo.model.ToDoList;

public interface ToDoCrudRepository extends CrudRepository<ToDoList, Long>{

}