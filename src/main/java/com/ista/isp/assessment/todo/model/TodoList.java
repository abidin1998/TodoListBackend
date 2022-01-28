package com.ista.isp.assessment.todo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The TodoList class
 *
 */
@Service
@Scope("application")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TodoList {

	/**
	 * The todoList
	 */
	private List<TodoValue> todoList = new ArrayList<>();
	
}
