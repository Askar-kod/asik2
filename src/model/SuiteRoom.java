public class SuiteRoom extends Room {

    public SuiteRoom(int id) {
        super(id, 150.0);
    }

    @Override
    public String getType() {
        return "Suite";
    }
}
