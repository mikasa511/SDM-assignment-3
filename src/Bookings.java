import java.util.List;

public class Bookings {

  private List<Ticket> tickets;

  public void makeNewBooking(Passenger passenger, Connection connection) {
    Ticket ticket = new Ticket(passenger, connection);
    tickets.add(ticket);
  }
}
