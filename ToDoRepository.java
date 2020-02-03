package com.ncr.todo.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;



import com.ncr.todo.model.ToDoList;



@Repository

public class ToDoRepository {

@Autowired

ToDoCrudRepository toDoCrudRepository;

	public Iterable<ToDoList> getData() {
		// TODO Auto-generated method stub
		return toDoCrudRepository.findAll();
	}
	
	public Iterable<ToDoList> addData(ToDoList todolist){
		toDoCrudRepository.save(todolist);
		return toDoCrudRepository.findAll();
	}
	
	public Iterable<ToDoList> deleteData(Long id){
		toDoCrudRepository.deleteById(id);
		return toDoCrudRepository.findAll();
	}
	
	public Iterable<ToDoList> updateData(ToDoList todolist){
		List<ToDoList> todolistCollection = (List<ToDoList>) toDoCrudRepository.findAll();
		
		for(int i=0; i<todolistCollection.size(); i++) {
			ToDoList tempList = todolistCollection.get(i);
			if(tempList.getID()==todolist.getID()) {
				todolistCollection.get(i).setTask(todolist.getTask());
				todolistCollection.get(i).setIsPriority(todolist.getIsPriority());
				break;
			}
		}
		
		toDoCrudRepository.saveAll((Iterable<ToDoList>)todolistCollection);
		return toDoCrudRepository.findAll();
	}

}