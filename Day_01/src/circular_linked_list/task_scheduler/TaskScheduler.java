package circular_linked_list.task_scheduler;

class TaskScheduler {
    private TaskNode head;
    private TaskNode currentTask;

    public TaskScheduler() {
        this.head = null;
        this.currentTask = null;
    }

    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);

        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            TaskNode last = getLastNode();
            newTask.next = head;
            head = newTask;
            last.next = head;
        }
        if (currentTask == null) {
            currentTask = head;
        }
    }

    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);

        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            TaskNode last = getLastNode();
            last.next = newTask;
            newTask.next = head;
        }
    }

    public void addTaskAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position <= 1) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        TaskNode current = head;
        int count = 1;

        while (count < position - 1 && current.next != head) {
            current = current.next;
            count++;
        }

        newTask.next = current.next;
        current.next = newTask;
    }

    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("No tasks available to remove.");
            return;
        }

        TaskNode current = head;
        TaskNode prev = null;

        do {
            if (current.taskId == taskId) {
                if (prev == null) {
                    TaskNode last = getLastNode();
                    head = head.next;
                    last.next = head;

                    if (current == current.next) {
                        head = null;
                        currentTask = null;
                    }
                } else {
                    prev.next = current.next;
                }
                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Task with ID " + taskId + " not found.");
    }

    public void viewAndMoveToNextTask() {
        if (currentTask == null) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Current Task: " + currentTask.taskName + " (ID: " + currentTask.taskId + ", Priority: " + currentTask.priority + ", Due Date: " + currentTask.dueDate + ")");
        currentTask = currentTask.next;
    }

    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode current = head;
        System.out.println("Tasks in the scheduler:");
        do {
            System.out.println("ID: " + current.taskId + ", Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        } while (current != head);
    }

    public void searchTaskByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode current = head;
        boolean found = false;
        do {
            if (current.priority == priority) {
                System.out.println("Task Found: ID: " + current.taskId + ", Name: " + current.taskName + ", Due Date: " + current.dueDate);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tasks with priority " + priority + " found.");
        }
    }

    private TaskNode getLastNode() {
        TaskNode current = head;
        while (current.next != head) {
            current = current.next;
        }
        return current;
    }
}
