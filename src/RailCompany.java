import java.sql.Date;

public class RailCompany {

  private Schedule schedule;
  private Bookings bookings;

  public RailCompany(Schedule schedule, Bookings bookings) {
    this.bookings = bookings;
    this.schedule = schedule;
  }

  public boolean issueBooking(
    Passenger passenger,
    Date date,
    String origin,
    String destination
  ) {
    // Connection
  }

  public Connection get(Date date, String origin, String destination) {
    Connection connection = schedule.getConnection();
  }
}
