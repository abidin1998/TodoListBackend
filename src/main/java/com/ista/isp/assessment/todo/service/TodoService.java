package com.ista.isp.assessment.todo.service;

import com.ista.isp.assessment.todo.model.TodoList;
import com.ista.isp.assessment.todo.model.TodoValue;

public interface TodoService {

	/**
	 * saveTodoList
	 * 
	 * @param request
	 * 			The request
	 * @return TodoList
	 */
	void saveTodoList(TodoValue request);
	
	
	/**
	 * saveTodoList
	 * 
	 * @return TodoList
	 */
	TodoList getTodoList();
	
	/**
	 * deleteTodoItem
	 * 
	 * @param value
	 * 			The value
	 */
	void deleteTodoItem(String value);
	
	
	/**
	 * The updateTodoItem
	 * 
	 * @param value
	 * 			The value
	 * @param checked
	 * 			The checked
	 */
	void updateTodoItem(String value,boolean checked);
}
