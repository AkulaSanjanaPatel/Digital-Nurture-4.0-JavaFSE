public class Test {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();

        tm.addTask(new Task(1, "Design Database", "Pending"));
        tm.addTask(new Task(2, "Build API", "In Progress"));
        tm.addTask(new Task(3, "Write Tests", "Pending"));

        System.out.println("All tasks:");
        tm.traverseTasks();

        System.out.println("\nSearching for Task 2:");
        Task t = tm.searchTask(2);
        System.out.println(t != null ? t : "Task not found");

        tm.deleteTask(2);
        System.out.println("\nAfter deleting Task 2:");
        tm.traverseTasks();
    }
}
