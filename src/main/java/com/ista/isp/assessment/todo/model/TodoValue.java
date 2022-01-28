package com.ista.isp.assessment.todo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The TodoValue class
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TodoValue {

	/**
	 * The taskName
	 */
	private String taskName;

	/**
	 * The done
	 */
	private boolean done;
	
}
