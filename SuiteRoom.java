public class SuiteRoom extends Room {
    public SuiteRoom(String kamar, double harga) {
        super(kamar, harga);
    }

    @Override
    public String tipekamar() {
        return "Suite Room";
    }
}
