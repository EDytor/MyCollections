package collections;

import java.util.*;

public class MyList<T> implements List<T> {
    Object[] list;
    int size;

    public MyList() {
        this.list = new Object[20];
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
        int item = 0;
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                index++;
            } else {
                item = i + 1;
            }
        }
        if (index == 0 && item == 0) {
            return size = 0;
        } else if (index == 0 && item == 1) {
            return size = 1;
        } else {
            return size = item;
        }
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
        if (size >= list.length) {
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
        list = new Object[size];
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
        T temporary = (T) list[index];
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = index; i < size; i++) {
                System.out.println();
                if (i == size - 1) {
                    break;
                } else {
                    list[i] = list[i + 1];
                }
            }
            size--;
            return temporary;
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