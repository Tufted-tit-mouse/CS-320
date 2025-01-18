package Task.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Task.Task;
import Task.TaskService;

class TaskServiceTest {

		TaskService tasks = new TaskService();
	
		@Test
		void testAddService() {
			Task testTask = new Task("724-1650", "RedLobsterBiscuit", "Red Lobster Cheddar Bay Biscuit Mix");
			tasks.addTask(testTask);
			assertTrue(!tasks.getTasks().isEmpty());	//Tests if the vector is empty
			assertTrue(tasks.getTasks().elementAt(0).getId().equals("724-1650"));	//Verify that the contact is in the vector
			assertTrue(tasks.getCount() != 0);	//Verify that the count of contacts is not 0
		}
		
		@Test
		void testDeleteTask() {
			Task testTask = new Task("724-1650", "RedLobsterBiscuit", "Red Lobster Cheddar Bay Biscuit Mix");
			tasks.addTask(testTask);
			tasks.deleteTask("724-1650");
		}
		
		@Test
		void testUpdateTaskName() {
			Task testTask = new Task("724-1650", "RedLobsterBiscuit", "Red Lobster Cheddar Bay Biscuit Mix");
			tasks.addTask(testTask);
			tasks.updateTaskName("724-1650", "KrusteazBiscuitMix");
			assertTrue(tasks.getTasks().elementAt(0).getName() == "KrusteazBiscuitMix");
		}
		
		@Test
		void testUpdateTaskDescription() {
			Task testTask = new Task("724-1650", "RedLobsterBiscuit", "Red Lobster Cheddar Bay Biscuit Mix");
			tasks.addTask(testTask);
			tasks.updateTaskDescript("724-1650", "Krusteaz Buttermilk Biscuit Mix");
			assertTrue(tasks.getTasks().elementAt(0).getDescript() == "Krusteaz Buttermilk Biscuit Mix");
		}
}
