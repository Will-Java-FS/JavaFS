package com.revature.models;

//Not a model for the DB but for User sent data. Will be mapped to out Movie object later.
public class MovieForm {

    private int id;
    private String title;
    private double price;
    private boolean available;
    private long returnDate;
    private String genre;
    private String[] actors;

    public MovieForm() {
    }

    public MovieForm(int id, String title, double price, boolean available, long returnDate, String genre) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.available = available;
        this.returnDate = returnDate;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public long getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(long returnDate) {
        this.returnDate = returnDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "MovieForm{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", available=" + available +
                ", returnDate=" + returnDate +
                ", genre='" + genre + '\'' +
                '}';
    }
}