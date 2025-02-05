package singly_linked_list.inventory_management_system;

class InventoryManagementSystem {
    private Node head;

    public void addItemAtBeginning(String itemName, int itemId, int quantity, double price) {
        Node newNode = new Node(itemName, itemId, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    public void addItemAtEnd(String itemName, int itemId, int quantity, double price) {
        Node newNode = new Node(itemName, itemId, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addItemAtPosition(String itemName, int itemId, int quantity, double price, int position) {
        Node newNode = new Node(itemName, itemId, quantity, price);
        if (position == 0) {
            addItemAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeItem(int itemId) {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item not found");
            return;
        }
        temp.next = temp.next.next;
    }

    public void updateQuantity(int itemId, int newQuantity) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    public void searchItem(String identifier) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemName.equals(identifier) || Integer.toString(temp.itemId).equals(identifier)) {
                System.out.println("Item Found: " + temp.itemName + ", ID: " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        Node temp = head;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        return totalValue;
    }

    public void sortInventory(String criterion, boolean ascending) {
        if (head == null || head.next == null) return;

        head = mergeSort(head, criterion, ascending);
    }

    private Node mergeSort(Node head, String criterion, boolean ascending) {
        if (head == null || head.next == null) return head;

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head, criterion, ascending);
        Node right = mergeSort(nextOfMiddle, criterion, ascending);

        return merge(left, right, criterion, ascending);
    }

    private Node merge(Node left, Node right, String criterion, boolean ascending) {
        if (left == null) return right;
        if (right == null) return left;

        boolean condition;
        if (criterion.equals("name")) {
            condition = ascending ? left.itemName.compareTo(right.itemName) < 0 : left.itemName.compareTo(right.itemName) > 0;
        } else {
            condition = ascending ? left.price < right.price : left.price > right.price;
        }

        if (condition) {
            left.next = merge(left.next, right, criterion, ascending);
            return left;
        } else {
            right.next = merge(left, right.next, criterion, ascending);
            return right;
        }
    }

    private Node getMiddle(Node head) {
        if (head == null) return head;

        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void displayInventory() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Item: " + temp.itemName + ", ID: " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }

}
