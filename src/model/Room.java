import java.util.Objects;

public abstract class Room {
    private int id;
    private double pricePerNight;
    private boolean available;

    public Room(int id, double pricePerNight) {
        this.id = id;
        this.pricePerNight = pricePerNight;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", type='" + getType() + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", available=" + available +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return id == room.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

