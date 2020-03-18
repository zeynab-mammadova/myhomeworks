package az.company.booking_project.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class User implements Serializable {
    private String username;
    private String password;
    private int id;
    int counter=0;
    private List<Booking> bookings;

    public User(String username, String password) {
       this.id=counter++;
        this.username=username;
        this.password=password;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return String.format("User username=%s, password=%s", username, password);
    }
}
