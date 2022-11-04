public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Book firstBook = new Book("Desperation", stephenKing, 1997);

        Book secondBook = new Book("Effective java", new Author("Joshua", "Bloch"), 2015);
        firstBook.setPublishYear(2020);
        System.out.println(firstBook.getPublishYear());

        System.out.println("Authors");
        Author stephenKing1 = new Author("Stephen", "King");
        Author stephenKing2 = new Author("Stephen", "King");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("Authors copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Authors copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing);
        System.out.println(levTolstoy);
    }
}