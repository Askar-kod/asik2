import java.util.*;
import java.util.stream.Collectors;

public class HotelService {
    private List<Room> rooms = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getAvailableRooms() {
        return rooms.stream()
                .filter(Room::isAvailable)
                .collect(Collectors.toList());
    }

    public List<Room> sortRoomsByPrice() {
        return rooms.stream()
                .sorted(Comparator.comparingDouble(Room::getPricePerNight))
                .collect(Collectors.toList());
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public Booking findBookingById(int id) {
        return bookings.stream()
                .filter(b -> b.equals(new Booking(id, null, null, null, null)))
                .findFirst()
                .orElse(null);
    }
}
