abstract class Room {
    private String kamar;
    private double harga;

    public Room(String kamar, double harga) {
        this.kamar = kamar;
        this.harga = harga;
    }

    public String getkamar() {
        return kamar;
    }

    public double getharga() {
        return harga;
    }

    public abstract String tipekamar();
}
