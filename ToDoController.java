package com.ncr.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.ncr.todo.model.ToDoList;

import com.ncr.todo.service.TodoService;



import io.swagger.annotations.ApiOperation;



@RestController

@ControllerAdvice

@Controller
public class ToDoController {



	@Autowired

	TodoService toDoService;

	

	@ApiOperation(value="",notes="")

	@GetMapping(value="/api/getData")

	public Iterable<ToDoList> getData() {

		return toDoService.getData();

	}
	
	@ApiOperation(value="",notes="")
	@PostMapping(value="/api/addData")
	
	public Iterable<ToDoList> addData(@RequestBody ToDoList todolist){
		return toDoService.addData(todolist);
	}
	
	
	@ApiOperation(value="", notes="")
	@DeleteMapping(value="/api/deleteData")
	
	public Iterable<ToDoList> deleteData(Long id){
		return toDoService.deleteData(id);
	}
	
	@ApiOperation(value="", notes="")
	@PutMapping(value="/api/updateData")
	
	public Iterable<ToDoList> updateData(@RequestBody ToDoList todolist){
		return toDoService.updateData(todolist);
	}

	

}