package ReservationEntities;

public class Reservation {
    int guestCount;
    int restauranteCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public Reservation(int count, int capacity, boolean open) {
        if (count < 1 || count > 8) {
            System.out.println("Invalid reservation!");
        }
        guestCount = count;
        restauranteCapacity = capacity;
        isRestaurantOpen = open;
    }

    public void confirmReservation() {
        if(restauranteCapacity >= guestCount && isRestaurantOpen){
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        }
        else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        if(!isConfirmed) {
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        }
        else {
            System.out.println("Please enjoy your meal!");
        }
    }

}