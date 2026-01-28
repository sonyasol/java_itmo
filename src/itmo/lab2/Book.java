package itmo.lab2;

public class Book {
    private String author;
    private String title;
    private Integer pages;
    private Double price;
    private Boolean isNew;

    public Book() //конструктор без параметров
    {
    }
    public Book(String author, String title, Integer pages, Double price, Boolean isNew)
    {
        this.author = author;
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPages() {
        return pages;
    }
}
