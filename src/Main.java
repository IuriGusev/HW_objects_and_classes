public class Main {
    public static void main(String[] args) {
        Book Academy = new Book("Academy", 1966, "Isaak Asimov");
        Academy.setPublishYear(1970);
        System.out.println("Название книги = " + Academy.getBookName());
        System.out.println("Год издания = " + Academy.getPublishYear());
        System.out.println("Автор книги = " + Academy.getBookAuthor());

        Book StarshipTroopers = new Book("Starship Troopers", 1959, "Robert Heinlein");
        StarshipTroopers.setPublishYear(1965);
        Author RobertHeinlein = new Author("Robert Heinlein");
        System.out.println(StarshipTroopers.getBookName() + "; " + StarshipTroopers.getPublishYear() + "; " + RobertHeinlein.getNameAuthor());
    }
}