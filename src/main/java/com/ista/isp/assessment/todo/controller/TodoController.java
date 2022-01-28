package com.ista.isp.assessment.todo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ista.isp.assessment.todo.model.TodoList;
import com.ista.isp.assessment.todo.model.TodoValue;
import com.ista.isp.assessment.todo.service.TodoService;

/**
 * The TodoController
 *
 */
@RestController
public class TodoController {

	
	/**
	 * 	The todoService
	 */
	private TodoService todoService;

	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	/**
	 * The saveTodoList
	 * 
	 * @param todoList
	 * 			The todoList
	 * @return TodoList
	 */
	@PutMapping("/todo/save")
	public void saveTodoList(@RequestBody(required = true) TodoValue todoList) {
		todoService.saveTodoList(todoList);
	}
	
	/**
	 * The getTodoList
	 * 
	 * @return TodoList
	 */
	@GetMapping("/todo/list")
	public ResponseEntity<TodoList> getTodoList() {
		return ResponseEntity.ok(todoService.getTodoList());
	}
	
	/**
	 * The deleteTodoItem
	 * 
	 * @param todoList
	 * 			The todoList
	 */
	@DeleteMapping("/todo/delete/{item}")
	public void deleteTodoItem(@PathVariable(value = "item") String item) {
		todoService.deleteTodoItem(item);
	}
	
	/**
	 * The updateItem
	 * 
	 * @param todoList
	 * 			The todoList
	 */
	@PostMapping("/todo/update")
	public void updateItem(@RequestBody(required = true) TodoValue todoList) {
		todoService.updateTodoItem(todoList.getTaskName(), todoList.isDone());
	}
}
