package singly_linked_list.inventory_management_system;

public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem inventory = new InventoryManagementSystem();

        inventory.addItemAtEnd("Smartphones", 101, 10, 40000);
        inventory.addItemAtEnd("Television", 102, 5, 80000);
        inventory.addItemAtEnd("Refrigerator", 103, 15, 15000);

        System.out.println("Initial Inventory:");
        inventory.displayInventory();

        inventory.addItemAtBeginning("Washing Mashine", 100, 8, 10000);
        System.out.println("\nAfter Adding NewItem at Beginning:");
        inventory.displayInventory();

        inventory.updateQuantity(101, 20);
        System.out.println("\nAfter Updating Quantity of Item1:");
        inventory.displayInventory();

        System.out.println("\nTotal Inventory Value: " + inventory.calculateTotalValue());

        inventory.sortInventory("price", true);
        System.out.println("\nAfter Sorting by Price in Ascending Order:");
        inventory.displayInventory();

        inventory.removeItem(102);
        System.out.println("\nAfter Removing Item2:");
        inventory.displayInventory();
    }
}
