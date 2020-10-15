package java8.cpt_6;

public class Book {

    private String title;
    private String author;

    public Book(String title, String author){
        this.title=title;
        setAuthor(author);
//        System.out.println("Title: " + title +"Author:"+ author);
    }
    public Book(String title){
        setTitle(title);
    }

    public Book (){
        System.out.println("This is Book");
    };

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
}
