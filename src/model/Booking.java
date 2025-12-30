import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Booking {
    private int id;
    private Room room;
    private Guest guest;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Booking(int id, Room room, Guest guest, LocalDate checkIn, LocalDate checkOut) {
        this.id = id;
        this.room = room;
        this.guest = guest;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        room.setAvailable(false);
    }

    public double getTotalPrice() {
        long days = ChronoUnit.DAYS.between(checkIn, checkOut);
        return days * room.getPricePerNight();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", guest=" + guest.getFullName() +
                ", room=" + room.getType() +
                ", totalPrice=" + getTotalPrice() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking booking = (Booking) o;
        return id == booking.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
