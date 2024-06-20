package com.example.demo.pojo;

import jakarta.persistence.*;

@Entity
@Table(name="hotel_food")
public class FoodBooking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="food_name")
    private String name;

    @Column(name="food_type")
    private String type;

    @Column(name="food_price")
    private double foodPrice;
    
    @OneToOne
    @JoinColumn(name="id", referencedColumnName="id")
    private RoomBooking roomBooking;
    
    @OneToOne
    @JoinColumn(name="id", referencedColumnName="id")
    private User user;
    
    @OneToOne
    @JoinColumn(name="payment_id", referencedColumnName="id")
    private Payment payment;

    public FoodBooking() {
    }

    public FoodBooking(int id, String name, String type, double foodPrice, RoomBooking roomBooking, User user, Payment payment) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.foodPrice = foodPrice;
        this.roomBooking = roomBooking;
        this.user = user;
        this.payment = payment;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public RoomBooking getRoomBooking() {
        return roomBooking;
    }

    public void setRoomBooking(RoomBooking roomBooking) {
        this.roomBooking = roomBooking;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
