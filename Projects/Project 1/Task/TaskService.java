package Task;

import java.util.Vector;

public class TaskService {
	private Vector<Task> tasks = new Vector<Task>();
	private int count = 0;
	
	public int getCount() {
		return count;
	}
	
	public Vector<Task> getTasks(){
		return tasks;
	}
	
	public void addTask(String id, String name, String descript) {
		Task newTask = new Task(id, name, descript);
		tasks.add(newTask);
		count++;
	}
	
	public void addTask(Task newTask) {
		tasks.add(newTask);
		count++;
	}
	
	public void deleteTask(String id) {
		if (id == null || id.length() >10) {
			throw new IllegalArgumentException("Invalid ID!");
		}
		if (tasks.isEmpty()) {
			throw new IllegalArgumentException("There are no tasks!");
		}
		int index = -1;
		for (Task task: tasks) {
			if (task.getId() == id) {
				index = tasks.indexOf(task);
			}
		}
		if (index == -1) {
			throw new IllegalArgumentException("No task with that ID");
		}
		else {
			tasks.remove(index);
			count--;
		}
	}
	
	public void updateTaskName(String id, String name) {
		if (id == null || id.length() >10) {
			throw new IllegalArgumentException("Invalid ID!");
		}
		if (tasks.isEmpty()) {
			throw new IllegalArgumentException("There are no tasks!");
		}
		int index = -1;
		for (Task task: tasks) {
			if (task.getId() == id) {
				index = tasks.indexOf(task);
			}
		}
		if (index == -1) {
			throw new IllegalArgumentException("No task with that ID");
		}
		else {
			Task updateTask = tasks.get(index);
			updateTask.setName(name);
			deleteTask(tasks.elementAt(index).getId());
			addTask(updateTask);
		}
	}
	
	public void updateTaskDescript(String id, String descript) {
		if (id == null || id.length() >10) {
			throw new IllegalArgumentException("Invalid ID!");
		}
		if (tasks.isEmpty()) {
			throw new IllegalArgumentException("There are no tasks!");
		}
		int index = -1;
		for (Task task: tasks) {
			if (task.getId() == id) {
				index = tasks.indexOf(task);
			}
		}
		if (index == -1) {
			throw new IllegalArgumentException("No task with that ID");
		}
		else {
			Task updateTask = tasks.get(index);
			updateTask.setDescript(descript);
			deleteTask(tasks.elementAt(index).getId());
			addTask(updateTask);
		}
	}
	
}
