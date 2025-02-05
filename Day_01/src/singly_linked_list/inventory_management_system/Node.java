package singly_linked_list.inventory_management_system;

class Node {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Node next;

    Node(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
