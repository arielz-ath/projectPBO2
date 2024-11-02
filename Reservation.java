public class Reservation {
    private Guest guest;
    private Room room;
    private int jumlahmalam;

    public Reservation(Guest guest, Room room, int jumlahmalam) {
        this.guest = guest;
        this.room = room;
        this.jumlahmalam = jumlahmalam;
    }

    public double calculateTotalCost() {
        return room.getharga() * jumlahmalam;
    }

    public String getReservationDetails() {
        return "Reservasi atas nama :" + guest.getName() + ", " +
                room.tipekamar() + " (Kamar : " + room.getkamar() + "), " +
                jumlahmalam + " malam, Total : Rp." + calculateTotalCost() ;
    }
}
