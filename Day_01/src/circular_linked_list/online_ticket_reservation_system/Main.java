package circular_linked_list.online_ticket_reservation_system;

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addReservation(1, "Raj", "Tara", "A1", "10:00 AM");
        system.addReservation(2, "Manish", "Tara", "A2", "10:05 AM");
        system.addReservation(3, "Arpita", "Sara", "B1", "11:00 AM");

        system.displayTickets();

        System.out.println("\nSearch Results:");
        system.searchTicket("Sara");

        System.out.println("\nRemoving Ticket ID 2:");
        system.removeTicketById(2);

        system.displayTickets();

        System.out.println("\nTotal Tickets: " + system.totalTickets());
    }
}
