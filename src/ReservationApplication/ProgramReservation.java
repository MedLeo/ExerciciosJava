package ReservationApplication;

import ReservationEntities.Reservation;

public class ProgramReservation {

    public static void main(String[] args) {

        Reservation reserv1 = new Reservation(3, 3, true);
        reserv1.confirmReservation();
        reserv1.informUser();

        Reservation reserv2 = new Reservation(9, 3, true);
        reserv2.confirmReservation();
        reserv2.informUser();
    }
}
