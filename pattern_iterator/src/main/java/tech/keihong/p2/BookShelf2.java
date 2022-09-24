package tech.keihong.p2;

import lombok.Data;
import tech.keihong.p1.*;

import java.util.ArrayList;
import java.util.List;

@Data
public class BookShelf2 implements Aggregate<Book> {

    private List<Book> books;
    private int size;


    public BookShelf2(int size) {
        this.size = size;
        this.books = new ArrayList<>();

    }

    @Override
    public int size() {
        return this.books.size();
    }

    @Override
    public boolean add(Book item) {
        books.add(item);
        return books.size() < size;
    }

    @Override
    public Book getAt(int index) {
        return books.get(index);
    }

    @Override
    public Iterator<Book> iterator() {
//        return new BookShelfIterator(this);
        return new BookShelfIterator2(this);
    }
}
