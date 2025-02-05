package circular_linked_list.round_robin_scheduling_algorithm;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4); // Time Quantum = 4

        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);

        scheduler.displayProcesses();

        scheduler.simulateScheduling();
    }
}
