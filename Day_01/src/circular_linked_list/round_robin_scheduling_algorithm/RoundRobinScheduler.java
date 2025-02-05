package circular_linked_list.round_robin_scheduling_algorithm;

class RoundRobinScheduler {
    private Process head;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.head = null;
        this.timeQuantum = timeQuantum;
    }

    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);

        if (head == null) {
            head = newProcess;
            newProcess.next = head; // Circular link
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }

    public void removeProcessById(int processId) {
        if (head == null) return;

        Process current = head, prev = null;

        do {
            if (current.processId == processId) {
                if (prev == null) {
                    Process last = getLastProcess();
                    head = head.next;
                    last.next = head;

                    if (current == current.next) {
                        head = null;
                    }
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    public void simulateScheduling() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        Process current = head;
        int totalTime = 0, processCount = 0;

        do {
            processCount++;
            current = current.next;
        } while (current != head);

        System.out.println("Starting Round Robin Scheduling with Time Quantum = " + timeQuantum);

        while (head != null) {
            current = head;
            System.out.println("\nExecuting Processes:");

            do {
                System.out.print("Process ID: " + current.processId + ", Burst Time Before: " + current.burstTime);

                if (current.burstTime > timeQuantum) {
                    current.burstTime -= timeQuantum;
                    totalTime += timeQuantum;
                } else {
                    totalTime += current.burstTime;
                    current.burstTime = 0;

                    current.turnaroundTime = totalTime;
                    current.waitingTime = current.turnaroundTime - current.burstTime;
                    System.out.print(", Completed Execution!");
                }

                System.out.println(", Burst Time After: " + current.burstTime);
                current = current.next;

            } while (current != head);

            current = head;
            do {
                if (current.burstTime == 0) {
                    removeProcessById(current.processId);
                }
                current = current.next;
            } while (current != head);
        }

        calculateAndDisplayAverages(processCount);
    }

    private void calculateAndDisplayAverages(int processCount) {
        int totalWaitingTime = 0, totalTurnaroundTime = 0;
        Process current = head;

        do {
            totalWaitingTime += current.waitingTime;
            totalTurnaroundTime += current.turnaroundTime;
            current = current.next;
        } while (current != head);

        double averageWaitingTime = (double) totalWaitingTime / processCount;
        double averageTurnaroundTime = (double) totalTurnaroundTime / processCount;

        System.out.println("\nAverage Waiting Time: " + averageWaitingTime);
        System.out.println("Average Turnaround Time: " + averageTurnaroundTime);
    }

    private Process getLastProcess() {
        Process temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        return temp;
    }

    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes to display.");
            return;
        }

        Process current = head;
        System.out.println("\nProcesses in the Scheduler:");
        do {
            System.out.println("Process ID: " + current.processId + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority);
            current = current.next;
        } while (current != head);
    }
}
