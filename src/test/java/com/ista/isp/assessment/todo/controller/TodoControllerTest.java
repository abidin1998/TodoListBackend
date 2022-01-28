package com.ista.isp.assessment.todo.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.ista.isp.assessment.todo.model.TodoValue;
import com.ista.isp.assessment.todo.service.TodoService;

@SpringBootTest
public class TodoControllerTest {

	@InjectMocks
	private TodoController todoController;
	
	@Mock
	TodoService todoService;
	
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getTodoListtest() {
		Assert.assertNotNull(todoController.getTodoList());
	}
	
	@Test
	public void saveTodoListtest() {
		TodoValue todoList = new TodoValue("", false);
		todoController.saveTodoList(todoList);
		Assert.assertNotNull(todoController);
	}
	
	@Test
	public void deleteTodoItemtest() {
		todoController.deleteTodoItem("x");
		Assert.assertNotNull(todoController);
	}
	
	@Test
	public void updateItemtest() {
		TodoValue todoList = new TodoValue("", false);
		todoController.updateItem(todoList);
		Assert.assertNotNull(todoController);
	}
	
}
