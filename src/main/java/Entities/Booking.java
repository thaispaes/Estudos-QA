package Entities;

public class Booking {

    private String lastname;
    private String firstname;
    private float totalPrice;
    private boolean depositpaid;
    private BookingData bookingdates;
    private String additionalneeds;


    public Booking(String lastname, String firstname, float totalPrice, boolean depositpaid, BookingData bookingdates, String additionalneeds) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.totalPrice = totalPrice;
        this.depositpaid = depositpaid;
        this.bookingdates = bookingdates;
        this.additionalneeds = additionalneeds;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public BookingData getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(BookingData bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

}
