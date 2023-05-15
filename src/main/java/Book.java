import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Book {
    private String title;
    private String author;
    private int year;
    private String edition;
    private String publisher;
    private float cost;
    private String synopsys;
    private String isbn;
    private String ean;
    private String illustrator;
    private int volume;
    private String image;
    private static int bookSavedNumber = 0;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getSynopsys() {
        return synopsys;
    }

    public void setSynopsys(String synopsys) {
        this.synopsys = synopsys;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void displayInformations() {
        System.out.println("Titre : " + this.getTitle());
        System.out.println("Auteur : " + this.getAuthor());
        System.out.println("Editeur : " + this.getPublisher());
        System.out.println("Synopsys : " + this.getSynopsys());
    }

    public static int getBookSavedNumber() {
        return bookSavedNumber;
    }

    public Book(String title, String author, String publisher, String synopsys) {
        bookSavedNumber++;

        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.synopsys = synopsys;
    }


}
