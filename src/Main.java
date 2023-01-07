public class Main {
    public static void main(String[] args){
        Author author1  = new Author(" Лев ", " Толстой ");
        Author author2  = new Author(" Александр ", " Пушкин ");
        Author author3  = new Author(" Иван ", " Бунин ");
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);
        Book book1 = new Book(" Труды ", author1," 1994 ");
        Book book2 = new Book(" Осень ", author2," 1972 ");
        Book book3 = new Book(" Пчела ", author3," 1842 ");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}