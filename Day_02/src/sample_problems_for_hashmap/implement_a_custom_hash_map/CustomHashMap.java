package sample_problems_for_hashmap.implement_a_custom_hash_map;

public class CustomHashMap {
    private static class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private static final int SIZE = 1000;
    private Node[] buckets;

    public CustomHashMap() {
        buckets = new Node[SIZE];
    }

    private int getIndex(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        Node head = buckets[index];

        if (head == null) {
            buckets[index] = new Node(key, value);
            return;
        }

        Node curr = head;
        while (curr != null) {
            if (curr.key == key) {
                curr.value = value;
                return;
            }
            if (curr.next == null) break;
            curr = curr.next;
        }

        curr.next = new Node(key, value);
    }

    public int get(int key) {
        int index = getIndex(key);
        Node curr = buckets[index];

        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = getIndex(key);
        Node curr = buckets[index];

        if (curr == null) return;

        if (curr.key == key) {
            buckets[index] = curr.next;
            return;
        }

        Node prev = null;
        while (curr != null && curr.key != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        }
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            if (buckets[i] != null) {
                System.out.print("Bucket " + i + ": ");
                Node curr = buckets[i];
                while (curr != null) {
                    System.out.print("[" + curr.key + " -> " + curr.value + "] ");
                    curr = curr.next;
                }
                System.out.println();
            }
        }
    }
}
