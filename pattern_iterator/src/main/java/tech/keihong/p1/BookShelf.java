package tech.keihong.p1;

import lombok.Data;

@Data
public class BookShelf implements Aggregate<Book> {

    private Book[] books;
    private int last;

    public BookShelf(int size) {
        this.books = new Book[size];
        this.last = 0;
    }

    @Override
    public int size() {
        return this.last;
    }

    @Override
    public boolean add(Book item) {
        books[last] = item;
        last++;
        return last < books.length;
    }

    @Override
    public Book getAt(int index) {
        return books[index];
    }

    @Override
    public Iterator<Book> iterator() {

        return new BookShelfIterator(this);
    }


}
