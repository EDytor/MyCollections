package collections;

import java.util.*;

public class MyList<T> implements List<T> {
    Object[] list;
    int size;

    public MyList() {
        this.list = new Object[0];
    }

    public MyList(int capacity) {
        this.size = capacity;
        if (capacity > 0) {
            this.list = new Object[capacity];
        } else if (capacity == 0) {
            this.list = new Object[0];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
    }

    @Override
    public int size() {
        return list.length;
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
        extendSize();
        list = Arrays.copyOf(list, size);
        list[size - 1] = t;
// TODO dodać powiększanie tablicy dwukrotnie zamiast ciagle tworzyć nową
        return true;
    }

    private void extendSize() {
        size = size + 1;
    }

    @Override
    public boolean remove(Object o) {
        Object[] newList = new Object[size - 1];
        int index = findFirstIndex(o);
        if (index == -1) {
            return false;
        } else {
            System.arraycopy(list, 0, newList, 0, index);
            System.arraycopy(list, index + 1, newList, index, size - index - 1);
            size = size - 1;
            list = newList;
            return true;
        }
    }

    private int findFirstIndex(Object o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (o == (list[i])) {
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
        for (int i = 0; i < size; i++) {
            list[i] = null;
        }
    }

    @Override
    public T get(int index) {
        return (T) list[index];
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
        Object[] newList = new Object[size - 1];
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            T o = (T) list[index];
            System.arraycopy(list, 0, newList, 0, index);
            System.arraycopy(list, index + 1, newList, index, size - index - 1);
            size = size - 1;
            list = newList;
            return o;
        }
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