package lesson_02_inner_class;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringWrapper  implements Iterable<Character> {
    private String text;

    public StringWrapper(String text) {
        super();
        this.text = text;
    }
    @Override
    public Iterator<Character> iterator() {
        return new StringIterator();
    }

    private class StringIterator implements Iterator<Character> {
        private int start = 0;

        public boolean hasNext() {//возвращает тру если есть что вернуть и фалс если нет
            return start < text.length();
        }

        public Character next() {
            if (hasNext()) {
                return  text.charAt(start++);
            }
            throw new NoSuchElementException();
        }
    }
}
