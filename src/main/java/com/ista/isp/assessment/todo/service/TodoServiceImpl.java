package com.ista.isp.assessment.todo.service;

import org.springframework.stereotype.Service;

import com.ista.isp.assessment.todo.model.TodoList;
import com.ista.isp.assessment.todo.model.TodoValue;

/**
 * The TodoServiceImpl
 *
 */
@Service
public class TodoServiceImpl implements TodoService {

	/**
	 *  The todoList
	 */
	private TodoList todoList;
	
	/**
	 * The TodoServiceImpl
	 * 
	 * @param todoList
	 * 			The todoList
	 */
	public TodoServiceImpl(TodoList todoList) {
		super();
		this.todoList = todoList;
	}

	/**
	 * saveTodoList
	 * 
	 * @param request
	 * 			The request
	 * @return TodoList
	 */
	@Override
	public void saveTodoList(TodoValue request) {
		boolean existsInList = todoList.getTodoList().stream()
				.anyMatch(f-> f.getTaskName().equals(request.getTaskName()));
		
		if(!existsInList) {
			todoList.getTodoList().add(request);
		}
	}
	
	/**
	 * saveTodoList
	 * 
	 * @return TodoList
	 */
	@Override
	public TodoList getTodoList() {
		return todoList;
	}
	
	/**
	 * saveTodoList
	 * 
	 * @return TodoList
	 */
	@Override
	public void deleteTodoItem(String value) {
		TodoValue valueDelete = todoList.getTodoList().stream()
				.filter(f-> f.getTaskName().equals(value)).findAny().get();
		todoList.getTodoList().remove(valueDelete);
	}
	
	/**
	 * The updateTodoItem
	 * 
	 * @param value
	 * 			The value
	 * @param checked
	 * 			The checked
	 */
	@Override
	public void updateTodoItem(String value,boolean checked) {
		todoList.getTodoList().forEach(f->{
			if(value.equals(f.getTaskName())) {
				f.setDone(checked);
			}
		});
	}
}
