public class SingleRoom extends Room {

    public SingleRoom(int id) {
        super(id, 50.0);
    }

    @Override
    public String getType() {
        return "Single";
    }
}
