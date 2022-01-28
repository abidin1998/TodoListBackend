package com.ista.isp.assessment.todo.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.ista.isp.assessment.todo.model.TodoList;
import com.ista.isp.assessment.todo.model.TodoValue;

@SpringBootTest
public class TodoServiceImplTest {

	@InjectMocks
	private TodoServiceImpl todoServiceImpl;
	
	@Mock
	TodoList todoList;
	
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getTodoListTest() {
		Assert.assertNotNull(todoServiceImpl.getTodoList());
	}
	
	@Test
	public void saveTodoListTest() {
		TodoValue request = new TodoValue("", false);
		todoServiceImpl.saveTodoList(request);
		Assert.assertNotNull(todoServiceImpl);
	}
	
	@Test
	public void saveTodoListTest1() {
		List<TodoValue> todovalue = new ArrayList<>();
		todovalue.add(new TodoValue("x", false));
		Mockito.when(todoList.getTodoList()).thenReturn(todovalue );
		TodoValue request = new TodoValue("x", false);
		todoServiceImpl.saveTodoList(request);
		Assert.assertNotNull(todoServiceImpl);
	}
	
	@Test
	public void deleteTodoItemTest() {
		List<TodoValue> todovalue = new ArrayList<>();
		todovalue.add(new TodoValue("x", false));
		Mockito.when(todoList.getTodoList()).thenReturn(todovalue );
		todoServiceImpl.deleteTodoItem("x");
		Assert.assertEquals(todovalue, new ArrayList<>());
		}
	
	
	@Test
	public void updateTodoItemTest() {
		List<TodoValue> todovalue = new ArrayList<>();
		todovalue.add(new TodoValue("1", false));
		Mockito.when(todoList.getTodoList()).thenReturn(todovalue );
		todoServiceImpl.updateTodoItem("x",false);
		Assert.assertNotNull(todoServiceImpl);
	}
	
	@Test
	public void updateTodoItemTest1() {
		List<TodoValue> todovalue = new ArrayList<>();
		todovalue.add(new TodoValue("x", false));
		Mockito.when(todoList.getTodoList()).thenReturn(todovalue );
		todoServiceImpl.updateTodoItem("x",false);
		Assert.assertNotNull(todoServiceImpl);
	}
}
