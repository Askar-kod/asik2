import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        HotelService service = new HotelService();

        Room r1 = new SingleRoom(1);
        Room r2 = new DoubleRoom(2);
        Room r3 = new SuiteRoom(3);

        service.addRoom(r1);
        service.addRoom(r2);
        service.addRoom(r3);

        Guest guest = new Guest(1, "Aibek Nur", "aibek@mail.com");

        Booking booking = new Booking(
                1,
                r3,
                guest,
                LocalDate.now(),
                LocalDate.now().plusDays(3)
        );

        service.addBooking(booking);

        System.out.println("Available rooms:");
        service.getAvailableRooms().forEach(System.out::println);

        System.out.println("\nSorted rooms by price:");
        service.sortRoomsByPrice().forEach(System.out::println);

        System.out.println("\nBooking info:");
        System.out.println(booking);
    }
}
