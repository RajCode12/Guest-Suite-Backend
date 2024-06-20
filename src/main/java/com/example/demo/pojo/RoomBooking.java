package com.example.demo.pojo;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "hotel_room_booking")
public class RoomBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "room_number")
    private int roomNumber;

    @Column(name = "room_type")
    private String type;

    @Column(name = "room_price")
    private double roomPrice;

    @Column(name = "is_booked")
    private boolean isBooked;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName="id")
    private User user;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName="id")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "payment_id", referencedColumnName="id")
    private Payment payment;

    public RoomBooking() {
    }

    public RoomBooking(int id, Date startDate, Date endDate, int roomNumber, String type, double roomPrice, boolean isBooked, User user, Customer customer, Payment payment) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomNumber = roomNumber;
        this.type = type;
        this.roomPrice = roomPrice;
        this.isBooked = isBooked;
        this.user = user;
        this.customer = customer;
        this.payment = payment;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
