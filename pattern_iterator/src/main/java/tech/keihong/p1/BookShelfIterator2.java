package tech.keihong.p1;

public class BookShelfIterator2 implements Iterator<Book> {

    private final Aggregate<Book> aggregate;
    private int index;

    public BookShelfIterator2(Aggregate<Book> aggregate) {
        this.aggregate = aggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < aggregate.size();
    }

    @Override
    public Book next() {
        Book book = aggregate.getAt(index);
        index++;
        index++;
        return book;
    }
}
