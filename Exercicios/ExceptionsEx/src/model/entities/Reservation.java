package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation() {}

    public Reservation(Integer roomNumber,Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Reservation dates for updates must be future");
        }
        if (!checkOut.after(checkIn)) {
           throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", Check In: "
                + sdf.format(checkIn)
                + ", Check Out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }

}
