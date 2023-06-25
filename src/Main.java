public class Main {
    public static void main(String[] args) {
        Author asimov = new Author("Isaak", "Asimov");
        Book academy = new Book("Academy", 1966, asimov);
        academy.setPublishYear(1970);
        System.out.println("Название книги = " + academy.getBookName());
        System.out.println("Год издания = " + academy.getPublishYear());
        System.out.println("Автор книги = " + academy.getAuthor().getFirstNameAuthor() +
                " " + academy.getAuthor().getSecondNameAuthor());

        Author heinlein = new Author("Robert", "Heinlein");
        Book starshipTroopers = new Book("Starship Troopers", 1959, heinlein);
        starshipTroopers.setPublishYear(1965);
        System.out.println(starshipTroopers.getBookName() + "; " + starshipTroopers.getPublishYear() + "; "
                + starshipTroopers.getAuthor().getFirstNameAuthor() + " " + starshipTroopers.getAuthor().getSecondNameAuthor());
    }
}