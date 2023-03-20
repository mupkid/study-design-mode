package org.ohx.studyiterator.bookself;

/**
 * @author haoxian, ou
 * @date 2021/8/2 23:12
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book next = (Book) iterator.next();
            System.out.println(next.getName());
        }
    }
}
