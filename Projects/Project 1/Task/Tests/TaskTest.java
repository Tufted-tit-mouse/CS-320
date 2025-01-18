package Task.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Task.Task;


class TaskTest {

	@Test
	void testNullArguments() {
		Assertions.assertThrows(IllegalArgumentException.class,  () ->{
			new Task(null, null, null);	//Test create Task with null arguments
		});
	}
	Task newTask = new Task("724-1650", "RedLobsterBiscuit", "Red Lobster Cheddar Bay Biscuit Mix");
	
	@Test
	void testCreateTask() {
		assertTrue(newTask.getId() == "724-1650");
		assertTrue(newTask.getName() == "RedLobsterBiscuit");
		assertTrue(newTask.getDescript() == "Red Lobster Cheddar Bay Biscuit Mix");
	}

	@Test
	void testId() {
		assertTrue(newTask.getId() == "724-1650");
	}
	
	@Test
	void testName() {
		assertTrue(newTask.getName() == "RedLobsterBiscuit");
		newTask.setName("KrusteazBiscuit");
		assertTrue(newTask.getName() == "KrusteazBiscuit");
	}
	
	@Test
	void testDescription() {
		assertTrue(newTask.getDescript() == "Red Lobster Cheddar Bay Biscuit Mix");
		newTask.setDescript("Krusteaz Buttermilk Biscuit Mix");
		assertTrue(newTask.getDescript() == "Krusteaz Buttermilk Biscuit Mix");
	}
}
