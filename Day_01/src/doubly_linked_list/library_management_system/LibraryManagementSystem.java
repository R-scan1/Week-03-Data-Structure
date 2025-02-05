package doubly_linked_list.library_management_system;

class LibraryManagementSystem {
    private BookNode head;
    private BookNode tail;
    private int bookCount;

    public LibraryManagementSystem() {
        this.head = null;
        this.tail = null;
        this.bookCount = 0;
    }

    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newBook = new BookNode(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        bookCount++;
    }

    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newBook = new BookNode(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        bookCount++;
    }

    public void addBookAtPosition(String title, String author, String genre, int bookId, boolean isAvailable, int position) {
        if (position <= 0) {
            addBookAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }

        BookNode newBook = new BookNode(title, author, genre, bookId, isAvailable);
        BookNode temp = head;
        int currentPosition = 0;

        while (temp != null && currentPosition < position - 1) {
            temp = temp.next;
            currentPosition++;
        }

        if (temp == null) {
            addBookAtEnd(title, author, genre, bookId, isAvailable);
        } else {
            newBook.next = temp.next;
            newBook.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newBook;
            } else {
                tail = newBook; // Update tail if added at the end
            }
            temp.next = newBook;
        }
        bookCount++;
    }

    public void removeBookById(int bookId) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp == head) {
                    head = temp.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (temp == tail) {
                    tail = temp.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                bookCount--;
                System.out.println("Book with ID " + bookId + " removed successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with ID " + bookId + " not found!");
    }

    public void searchBook(String title, String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if ((title != null && temp.title.equalsIgnoreCase(title)) ||
                    (author != null && temp.author.equalsIgnoreCase(author))) {
                System.out.println("Found: Title=" + temp.title + ", Author=" + temp.author +
                        ", Genre=" + temp.genre + ", Book ID=" + temp.bookId +
                        ", Available=" + temp.isAvailable);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found for the given search criteria.");
        }
    }

    public void updateBookAvailability(int bookId, boolean newStatus) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = newStatus;
                System.out.println("Availability status updated for Book ID " + bookId + " to " + newStatus);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with ID " + bookId + " not found!");
    }

    public void displayBooksForward() {
        BookNode temp = head;
        System.out.println("Books in forward order:");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Author: " + temp.author +
                    ", Genre: " + temp.genre + ", Book ID: " + temp.bookId +
                    ", Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    public void displayBooksReverse() {
        BookNode temp = tail;
        System.out.println("Books in reverse order:");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Author: " + temp.author +
                    ", Genre: " + temp.genre + ", Book ID: " + temp.bookId +
                    ", Available: " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    public void countBooks() {
        System.out.println("Total number of books in the library: " + bookCount);
    }
}