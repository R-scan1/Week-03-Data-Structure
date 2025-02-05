package circular_linked_list.online_ticket_reservation_system;

class TicketReservationSystem {
    private Ticket head;

    public TicketReservationSystem() {
        head = null;
    }

    public void addReservation(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            head = newTicket;
            newTicket.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
    }

    public void removeTicketById(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = head, prev = null;

        do {
            if (current.ticketId == ticketId) {
                if (prev == null) {
                    Ticket last = getLastTicket();
                    if (current.next == current) {
                        head = null;
                    } else {
                        head = head.next;
                        last.next = head;
                    }
                } else {
                    prev.next = current.next;
                }
                System.out.println("Ticket with ID " + ticketId + " removed successfully.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket with ID " + ticketId + " not found.");
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        Ticket current = head;
        System.out.println("Current Ticket Reservations:");
        do {
            System.out.println("Ticket ID: " + current.ticketId +
                    ", Customer Name: " + current.customerName +
                    ", Movie Name: " + current.movieName +
                    ", Seat Number: " + current.seatNumber +
                    ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    public void searchTicket(String searchKey) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        Ticket current = head;
        boolean found = false;

        do {
            if (current.customerName.equalsIgnoreCase(searchKey) || current.movieName.equalsIgnoreCase(searchKey)) {
                System.out.println("Ticket Found - Ticket ID: " + current.ticketId +
                        ", Customer Name: " + current.customerName +
                        ", Movie Name: " + current.movieName +
                        ", Seat Number: " + current.seatNumber +
                        ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No ticket found for search key: " + searchKey);
        }
    }

    public int totalTickets() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Ticket current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }

    private Ticket getLastTicket() {
        Ticket temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        return temp;
    }
}