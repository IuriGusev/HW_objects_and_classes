public class Book{
    private String bookName;
    private int publishYear;
    private String author;

    public Book (String bookName, int publishYear, String author) {
        this.bookName = bookName;
        this.publishYear = publishYear;
        this.author = author;
    }

    public String getBookName () {
        return this.bookName;
    }
    public int getPublishYear () {
        return this.publishYear;
    }
    public void setPublishYear (int publishYear) {
        this.publishYear = publishYear;
    }

    public String getAuthor() {
        return author;
    }
}
