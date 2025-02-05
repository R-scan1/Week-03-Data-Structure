package doubly_linked_list.library_management_system;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();

        libraryManagementSystem.addBookAtBeginning("Sand", "Manish", "Action", 101, true);
        libraryManagementSystem.addBookAtEnd("Water", "Raj", "Comedy", 102, true);
        libraryManagementSystem.addBookAtPosition("Air", "Arpita", "Horror", 103, false, 1);

        libraryManagementSystem.displayBooksForward();
        System.out.println();
        libraryManagementSystem.displayBooksReverse();

        libraryManagementSystem.searchBook("Sand", null);
        libraryManagementSystem.searchBook(null, "Manish");

        libraryManagementSystem.updateBookAvailability(103, true);

        libraryManagementSystem.removeBookById(102);

        libraryManagementSystem.displayBooksForward();

        libraryManagementSystem.countBooks();
    }
}
