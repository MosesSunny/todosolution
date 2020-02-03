package com.ncr.todo.model;

import javax.persistence.*;

@Entity

@Table(name = "List")

public class ToDoList {   



    @Id

    @GeneratedValue(strategy=GenerationType.AUTO)

    private Long ID;

    

    @Column(name= "Tasks")

    private String task;

    

    @Column(name= "Priority")

    private Boolean isPriority;



	public Long getID() {

		return ID;

	}



	public void setID(Long iD) {

		ID = iD;

	}



	public String getTask() {

		return task;

	}



	public void setTask(String task) {

		this.task = task;

	}



	public Boolean getIsPriority() {

		return isPriority;

	}



	public void setIsPriority(Boolean isPriority) {

		this.isPriority = isPriority;

	}







}