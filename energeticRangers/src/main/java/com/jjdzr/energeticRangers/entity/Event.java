package com.jjdzr.energeticRangers.entity;

import javax.persistence.*;

@Entity

public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int numberOfTickets;
    private String nameOfEvent;
    private double price;
    private String imgUrl;
    private String typeOfEvent;
    private String city;
    private String date;
    private String descriptionShort;
    private String descriptionLong;
    private String dayOfEvent;
    private String monthOfEvent;
    private String yearOfEvent;


    public Event(int id, int numberOfTickets, String nameOfEvent, Double price, String imgUrl, String typeOfEvent, String city, String date, String descriptionShort, String descriptionLong, String dayOfEvent, String monthOfEvent, String yearOfEvent) {
        this.id = id;
        this.numberOfTickets = numberOfTickets;
        this.nameOfEvent = nameOfEvent;
        this.price = price;
        this.imgUrl = imgUrl;
        this.typeOfEvent = typeOfEvent;
        this.city = city;
        this.date = date;
        this.descriptionShort = descriptionShort;
        this.descriptionLong = descriptionLong;
        this.dayOfEvent = dayOfEvent;
        this.monthOfEvent = monthOfEvent;
        this.yearOfEvent = yearOfEvent;
    }

    public Event() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    public String getDescriptionLong() {
        return descriptionLong;
    }

    public void setDescriptionLong(String descriptionLong) {
        this.descriptionLong = descriptionLong;
    }

    public String getDayOfEvent() {
        return dayOfEvent;
    }

    public void setDayOfEvent(String dayOfEvent) {
        this.dayOfEvent = dayOfEvent;
    }

    public String getMonthOfEvent() {
        return monthOfEvent;
    }

    public void setMonthOfEvent(String monthOfEvent) {
        this.monthOfEvent = monthOfEvent;
    }

    public String getYearOfEvent() {
        return yearOfEvent;
    }

    public void setYearOfEvent(String yearOfEvent) {
        this.yearOfEvent = yearOfEvent;
    }
}



