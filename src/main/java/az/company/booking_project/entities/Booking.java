package az.company.booking_project.entities;

import java.io.Serializable;
import java.util.List;

public class Booking implements Serializable {
    private int id;
    private int flightID;
    private List<Passenger> passengers;
    static int count=0;

    public Booking(int flightID, List<Passenger> passengers) {
        this.id = ++count;
        this.flightID = flightID;
        this.passengers = passengers;
    }

    public int getId() {

        return id;
    }

    @Override
    public String toString() {
        return String.format("Booking ID:%-3d Flight ID:%-3d PassengerList:%-12s \n", id, flightID, passengers);
    }
}
