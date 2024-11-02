public class Main {
    public static void main(String[] args) {
        Room standardRoom = new StandardRoom("STD001", 100);
        Room suiteRoom = new SuiteRoom("SUI001", 200);

        Guest guest1 = new Guest("agus", "agussedih@gamil.com");

        Reservation reservation1 = new Reservation(guest1, standardRoom, 3);
        System.out.println(reservation1.getReservationDetails());

        Reservation reservation2 = new Reservation(guest1, suiteRoom, 2);
        System.out.println(reservation2.getReservationDetails());
    }
}
