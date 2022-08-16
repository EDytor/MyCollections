package collections;

import java.util.*;

public class MyLinkedList<T> implements List<T>, Deque<T> {

    public MyLinkedList() {
    }

    int size;
    Element<T> first;

    private static class Element<T> {
        T element;
        MyLinkedList.Element<T> next;
        MyLinkedList.Element<T> prev;

        Element(MyLinkedList.Element<T> prev, T element, MyLinkedList.Element<T> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public void addFirst(T element) {
        first = new Element<>(null, element, null);
        size++;
    }

    @Override
    public void addLast(T t) {
    }

    @Override
    public boolean offerFirst(T t) {
        return false;
    }

    @Override
    public boolean offerLast(T t) {
        return false;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T pollFirst() {
        return null;
    }

    @Override
    public T pollLast() {
        return null;
    }

    public T getFirst() {
        if (first == null)
            throw new NoSuchElementException();
        return first.element;
    }

    public T getLast() {
        return null;
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
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
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
        } else if (first.next == null) {
            first.next = new Element<>(first, t, null);
            size++;
        } else {
            Element<T> temporaryElement = first.next;
            while (true) {
                if (temporaryElement.next == null) {
                    temporaryElement.next = new Element<>(temporaryElement, t, null);
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
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        int i = indexOf(o);
        remove(i);
        return false;
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

    }

    @Override
    public T pop() {
        return null;
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
            i.prev = null;
            i.element = null;
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
            return first.element;
        } else {
            Element<T> element = first;
            for (int i = 0; i < index; i++) {
                element = element.next;
            }
            return element.element;
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
            firstObject = first.element;
            Element<T> e = first.next;
            first.element = e.element;
            for (int i = 2; i < size; i++) {
                e.element = e.next.element;
                e = e.next;
            }
            size--;
            return firstObject;
        } else {
            Element<T> element = first;
            for (int i = 0; i < index; i++) {
                element = element.next;
            }
            Element<T> n = element.next;
            firstObject = element.element;
            for (int i = index + 1; i < size; i++) {
                element.element = n.element;
                n = n.next;
            }
        }
        size--;
        return firstObject;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o.equals(first.element)) {
            return index;
        } else {
            index++;
        }
        if (o.equals(first.next.element)) {
            return index;
        } else {
            index++;
        }
        Element<T> temporaryElement = first.next;
        while (true) {
            if (o.equals(temporaryElement.next.element)) {
                return index;
            } else if (index == size) {
                break;
            } else {
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
