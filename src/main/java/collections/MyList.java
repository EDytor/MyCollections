package collections;

import java.util.*;

public class MyList<T> implements List<T> {
    private Object[] list;
    private int capacity;
    private int size;

    public MyList() {
        this.list = new Object[20];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        if (capacity >= 0) {
            this.list = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
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
        for (int i = 0; i < size; i++) {
            if (Objects.equals(o, list[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
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
        if (capacity >= list.length) {
            list = Arrays.copyOf(list, list.length + 10);
        }
        list[size] = t;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = findFirstIndex(o);
        if (index == -1) {
            return false;
        } else {
            remove(index);
            return true;
        }
    }

    private int findFirstIndex(Object o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (o.equals(list[i])) {
                return i;
            }
        }
        return index;
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
        size = 0;
        list = new Object[size];
    }

    @Override
    public T get(int index) {
        if (index < size) {
            return (T) list[index];
        } else {
            throw new IndexOutOfBoundsException();
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
        T temporary = (T) list[index];
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            System.arraycopy(list, index + 1, list, index, size - index);
        }
        size--;
        return temporary;
    }


    @Override
    public int indexOf(Object o) {
        return 0;
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