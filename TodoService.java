package com.ncr.todo.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.ncr.todo.model.ToDoList;

import com.ncr.todo.repository.ToDoRepository;



@Service

public class TodoService {


	@Autowired
	ToDoRepository toDoRepository;

	public Iterable<ToDoList> getData() {

		return toDoRepository.getData();

	}
	
	public Iterable<ToDoList> addData(ToDoList todolist){
		return toDoRepository.addData(todolist);
	}
	
	public Iterable<ToDoList> deleteData(Long id){
		return toDoRepository.deleteData(id);
	}
	
	public Iterable<ToDoList> updateData(ToDoList todolist){
		return toDoRepository.updateData(todolist);
	}


}