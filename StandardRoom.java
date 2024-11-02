public class StandardRoom extends Room {
    public StandardRoom(String kamar, double harga) {
        super(kamar, harga);
    }

    @Override
    public String tipekamar() {
        return "Standard Room";
    }
}
