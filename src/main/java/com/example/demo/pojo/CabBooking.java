package com.example.demo.pojo;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="hotel_cab")
public class CabBooking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="source")
    private String source;

	@Column(name="destination")
    private String destination;
	
	@Column(name="date")
	private Date date;

	@Column(name="car_name")
    private String carName;

    @Column(name="car_number")
    private String carNumber;

    @Column(name="seater")
    private int seater;

    @Column(name="cab_price")
    private double cabPrice;
    
    @OneToOne
    @JoinColumn(name="id", referencedColumnName="id")
    private User user;
    
    @OneToOne
    @JoinColumn(name="id", referencedColumnName="id")
    private Payment payment;

    public CabBooking() {
    }

    public CabBooking(int id, String source, String destination, Date date, String carName, String carNumber, int seater, double cabPrice, User user, Payment payment) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.carName = carName;
        this.carNumber = carNumber;
        this.seater = seater;
        this.cabPrice = cabPrice;
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
    
    public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getSeater() {
        return seater;
    }

    public void setSeater(int seater) {
        this.seater = seater;
    }

    public double getCabPrice() {
        return cabPrice;
    }

    public void setCabPrice(double cabPrice) {
        this.cabPrice = cabPrice;
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
