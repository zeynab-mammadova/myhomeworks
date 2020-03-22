package az.company.booking_project.entities;

import az.company.booking_project.Exceptions.FileException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Database implements Serializable {



    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    private List<Flight> flightList = new ArrayList<>();
    private List<Booking> bookingList = new ArrayList<>();
    private List<User> userlist=new ArrayList<>();

    public List<User> getUserlist() {
        return userlist;
    }



    public List<Flight> readFromFileFlights()  {
        try{
        File fileFlights = new File("flights.txt");
        FileInputStream fis = new FileInputStream(fileFlights);
        ObjectInputStream ois = new ObjectInputStream(fis);
        flightList = (List<Flight>) ois.readObject();
        ois.close();
        fis.close();}
        catch (IOException | ClassNotFoundException e){
            throw new FileException("File is not found");

        }
        return flightList;
    }
    public List<Booking> readFromFileMyBookings(){
        try{
            File file = new File("bookings.txt");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            bookingList= (List<Booking>) ois.readObject ();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new FileException("File is not found");
        }
        return bookingList;
    }
    public  boolean writeToFileBooking(){

        try {
            File file = new File("bookings.txt");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bookingList);
            oos.close();
            fos.close();
            return true;
        }
        catch (IOException e) {
            throw new FileException("File is not found");
        }
//        }catch (Exception io){
//            io.printStackTrace();
//            System.out.println(io.getMessage());
//            throw new RuntimeException();
//        }
    }

    public List<Flight> getAllFlights() {
        return readFromFileFlights();

    }

    public List<Booking> getAllBookings() {
        return readFromFileMyBookings();

    }



    public List<Booking> getBookingList() {
        return bookingList;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }


    public List<User> getAllUsers() {
        return readFromFileUsers();
    }

    private List<User> readFromFileUsers() {
        try {
            File file =new File("users.txt");
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            userlist= (List<User>) ois.readObject();
        }catch (IOException | ClassNotFoundException e) {
            throw new FileException("File is not found");
        }
        return userlist;
    }
    public boolean writeToFileUsers(){
        try {
            File file=new File("users.txt");
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(userlist);
            oos.close();
            fos.close();
            return true;
        }catch (IOException e) {
            throw new FileException("File is not found");
        }
    }
}