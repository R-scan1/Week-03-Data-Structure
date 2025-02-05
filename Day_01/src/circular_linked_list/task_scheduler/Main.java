package circular_linked_list.task_scheduler;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTaskAtEnd(1, "Task 1", 3, "2025-01-30");
        scheduler.addTaskAtEnd(2, "Task 2", 2, "2025-02-05");
        scheduler.addTaskAtBeginning(3, "Task 3", 1, "2025-01-28");
        scheduler.addTaskAtPosition(2, 4, "Task 4", 4, "2025-02-10");

        scheduler.displayAllTasks();

        System.out.println("\nViewing tasks in sequence:");
        scheduler.viewAndMoveToNextTask();
        scheduler.viewAndMoveToNextTask();

        System.out.println("\nRemoving a task:");
        scheduler.removeTaskById(2);
        scheduler.displayAllTasks();

        System.out.println("\nSearching for tasks with priority 1:");
        scheduler.searchTaskByPriority(1);
    }
}
