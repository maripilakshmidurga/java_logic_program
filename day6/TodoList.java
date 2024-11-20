import java.util.LinkedList;
public class TodoList {
    private LinkedList<String> tasks;
    public TodoList() {
        tasks = new LinkedList<>();
    }
    public void addTaskToEnd(String task) {
        tasks.addLast(task);
        System.out.println("Task added at the end: " + task);
    }

    public void addTaskToFront(String task) {
        tasks.addFirst(task);
        System.out.println("Task added at the front: " + task);
    }
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("The to-do list is empty.");
        } else {
            System.out.println("To-Do List:");
            for (String task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void completeTaskFromFront() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to complete.");
        } else {
            String completedTask = tasks.removeFirst();
            System.out.println("Task completed (from front): " + completedTask);
        }
    }

   
    public void completeTaskFromEnd() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to complete.");
        } else {
            String completedTask = tasks.removeLast();
            System.out.println("Task completed (from end): " + completedTask);
        }
    }


    public void updateTask(int index, String newTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newTask);
            System.out.println("Task at index " + index + " updated to: " + newTask);
        } else {
            System.out.println("Invalid index. No task updated.");
        }
    }

    
 public static void main(String[] args) {
        TodoList myTodoList = new TodoList();

        myTodoList.addTaskToEnd("Buy groceries");
        myTodoList.addTaskToEnd("Clean the house");
        myTodoList.addTaskToFront("Finish homework");
        myTodoList.displayTasks();
        myTodoList.completeTaskFromFront();
        myTodoList.completeTaskFromEnd();
        myTodoList.updateTask(0, "Buy groceries and snacks");
        myTodoList.displayTasks();
    }
}
