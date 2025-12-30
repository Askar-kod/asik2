import java.util.Objects;

public class Guest {
    private int id;
    private String fullName;
    private String email;

    public Guest(int id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest)) return false;
        Guest guest = (Guest) o;
        return id == guest.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
