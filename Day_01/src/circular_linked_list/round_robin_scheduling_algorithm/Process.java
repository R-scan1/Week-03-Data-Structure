package circular_linked_list.round_robin_scheduling_algorithm;

class Process {
    int processId;
    int burstTime;
    int priority;
    int waitingTime;
    int turnaroundTime;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.next = null;
    }
}