package tech.keihong.p1;

import tech.keihong.p2.BookShelf2;

public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(12);
//        BookShelf2 bookShelf = new BookShelf2(12);

        for (int i = 0; i < 10; i++) {
            boolean empty = bookShelf.add(new Book("超级学习者" + (i + 1)));
            if (!empty) {
                break;
            }
        }

        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }


        System.out.println("=========");

        Iterator<Book> iterator1 = new BookShelfIterator2(bookShelf);
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
