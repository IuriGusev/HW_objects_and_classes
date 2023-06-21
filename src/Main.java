public class Main {
    public static void main(String[] args) {

        Book Academy = new Book("academy", 1966, "isaak asimov");
        Academy.setPublishYear(1970);
        System.out.println("Название книги = " + Academy.getBookName());
        System.out.println("Год издания = " + Academy.getPublishYear());
        System.out.println("Автор книги = " + Academy.getAuthor().getFirstNameAuthor() + Academy.getAuthor().getSecondNameAuthor());

        Book StarshipTroopers = new Book("starship troopers", 1959, "robert heinlein");
        StarshipTroopers.setPublishYear(1965);
        System.out.println(StarshipTroopers.getBookName() + "; " + StarshipTroopers.getPublishYear() + "; "
                + StarshipTroopers.getAuthor().getFirstNameAuthor() +  StarshipTroopers.getAuthor().getSecondNameAuthor());
    }
}