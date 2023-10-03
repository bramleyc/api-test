package com.booking.apitest;

public class Booking {
    private String reference;
    private String name;
    private float price;
    private String airport;
    private String startDate;
    private String endDate;

    // Parameterized Constructor
    public Booking(String reference, String name, float price, String airport, String startDate, String endDate) {
        this.reference = reference;
        this.name = name;
        this.price = price;
        this.airport = airport;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Default Constructor (if needed)
    public Booking() {
    }

    // Getters and setters
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
