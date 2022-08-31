package collections;

import java.util.*;

public class MyLinkedList<T> implements List<T>, Deque<T> {

    public MyLinkedList() {
    }

    int size;
    Element<T> first;
    Element<T> last;

    private static class Element<T> {
        Element<T> previous;
        T currentElement;
        Element<T> next;

        Element(Element<T> previous, T currentElement, Element<T> next) {
            this.previous = previous;
            this.currentElement = currentElement;
            this.next = next;
        }
    }

    @Override
    public void addFirst(T element) {
        if (element == null) {
            throw new NullPointerException();
        }
        Element<T> previousFirst;
        if (first != null) {
            previousFirst = first;
            first = new Element<>(null, element, previousFirst);
        } else {
            Element<T> newElement = new Element<>(null, element, null);
            first = newElement;
            last = newElement;
        }
        size++;
    }

    @Override
    public void addLast(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        if (size == 0) {
            addFirst(t);
            last.currentElement = t;
        } else {
            Element<T> l = last;
            Element<T> newElement = new Element<>(l, t, null);
            last = newElement;
            if (l == null)
                first = newElement;
            else
                l.next = newElement;
            size++;
        }
    }

    @Override
    public boolean offerFirst(T t) {
        try {
            addFirst(t);
        } catch (NullPointerException | IllegalArgumentException | ClassCastException e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean offerLast(T t) {
        try {
            addLast(t);
        } catch (NullPointerException | IllegalArgumentException | ClassCastException e) {
            return false;
        }
        return true;
    }

    @Override
    public T removeFirst() {
        return remove(0);
    }

    @Override
    public T removeLast() {
        T temporary = last.currentElement;
        if (size == 1) {
            clear();
            return temporary;
        } else {
            last = last.previous;
            size--;
        }

        return temporary;
    }

    @Override
    public T pollFirst() {
        Element<T> element = first;
        if (element == null) {
            return null;
        } else {
            return remove(0);
        }
    }

    @Override
    public T pollLast() {
        Element<T> element = last;
        if (element == null) {
            return null;
        } else {
            return removeLast();
        }
    }

    public T getFirst() {
        if (first == null)
            throw new NoSuchElementException();
        return first.currentElement;
    }

    public T getLast() {
        if (size != 0) {
            return last.currentElement;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public T peekFirst() {
        return null;
    }

    @Override
    public T peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        remove(o);
        return true;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        int index = 0;
        int lastOccurrence = -1;
        Element<T> temporaryElement = first;
        while (true) {
            if (o.equals(temporaryElement.currentElement)) {
                lastOccurrence = index;
            }
            if (index == size - 1) {
                break;
            }
            temporaryElement = temporaryElement.next;
            index++;
        }
        if (lastOccurrence >= 0) {
            remove(lastOccurrence);
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Iterator<T> descendingIterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if (size == 0 || first == null) {
            addFirst(t);
        } else {
            Element<T> temporaryElement = first;
            while (true) {
                if (temporaryElement.next == null) {
                    temporaryElement.next = new Element<>(temporaryElement, t, null);
                    last = temporaryElement.next;
                    size++;
                    break;
                } else {
                    temporaryElement = temporaryElement.next;
                }
            }
        }
        return true;
    }

    @Override
    public boolean offer(T t) {
        return false;
    }

    @Override
    public T remove() {
        return removeFirst();
    }

    @Override
    public T poll() {
        return pollFirst();
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        Element<T> element = first;
        if (element == null) {
            return null;
        } else {
            return getFirst();
        }
    }

    @Override
    public boolean remove(Object o) {
        int i = indexOf(o);
        if (i >= 0) {
            remove(i);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public void push(T t) {
        addFirst(t);
    }

    @Override
    public T pop() {
        if (size == 0) {
            return null;
        } else {
            return removeFirst();
        }
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        for (Element<T> i = first; i != null; ) {
            Element<T> element = i.next;
            i.currentElement = null;
            i.next = null;
            i = element;
        }
        first = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return first.currentElement;
        } else {
            Element<T> element = first;
            for (int i = 0; i < index; i++) {
                element = element.next;
            }
            return element.currentElement;
        }
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {
    }

    @Override
    public T remove(int index) {
        T firstObject;
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            firstObject = get(0);
            if (first.next == null) {
                first = null;
                size = 0;
                return firstObject;
            }
            Element<T> e = first.next;
            first.currentElement = e.currentElement;
            for (int i = 2; i < size; i++) {
                e.currentElement = e.next.currentElement;
                e = e.next;
            }
            size--;
            return firstObject;
        } else {
            Element<T> element = first;
            for (int i = 0; i < index; i++) {
                element = element.next;
            }
            firstObject = element.currentElement;
            for (int i = index + 1; i < size; i++) {
                element.currentElement = element.next.currentElement;
                element = element.next;
            }
        }
        size--;
        return firstObject;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        Element<T> temporaryElement = first;
        while (true) {
            if (o.equals(temporaryElement.currentElement)) {
                return index;
            } else {
                if (index == size - 1) {
                    break;
                }
                temporaryElement = temporaryElement.next;
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
