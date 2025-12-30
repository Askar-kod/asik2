public class DoubleRoom extends Room {

    public DoubleRoom(int id) {
        super(id, 80.0);
    }

    @Override
    public String getType() {
        return "Double";
    }
}
