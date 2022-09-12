package collections.tree;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class BinaryTree<T> implements Collection<T> {

    private Node<T> root;
    private int size;
    private final Comparator<T> comparator;

    public BinaryTree(Comparator<T> comparator) {
        this.comparator = comparator;
        root = null;
    }
    private static class Node<T> {
        public T element;
        public Node<T> left, right;

        public Node(T newElement) {
            element = newElement;
            left = null;
            right = null;
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
        return isElementContainedInTree((T) o, root);
    }

    private boolean isElementContainedInTree(T o, Node<T> node) {
        if (node == null) {
            return false;
        }
        if (comparator.compare(o, node.element) < 0) {
            if (node.left == null) {
                return false;
            }
            if (node.left.element.equals(o)) {
                return true;
            } else {
                return isElementContainedInTree(o, node.left);
            }
        } else if (comparator.compare(o, node.element) == 0) {
            return true;
        } else {
            if (node.right == null) {
                return false;
            }
            if (node.right.element.equals(o)) {
                return true;
            } else {
                return isElementContainedInTree(o, node.right);
            }
        }
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
    public boolean add(T newElement) {
        if (root == null) {
            root = new Node<>(newElement);
            size++;
            return true;
        } else {
            return insertElement(root, newElement);
        }
    }

    private boolean insertElement(Node<T> top, T newElement) {
        if (comparator.compare(newElement, top.element) < 0) {
            if (top.left == null) {
                top.left = new Node<>(newElement);
                size++;
            } else {
                insertElement(top.left, newElement);
            }
            return true;
        } else {
            if (top.right == null) {
                top.right = new Node<T>(newElement);
                size++;
            } else {
                insertElement(top.right, newElement);
            }
            return true;
        }
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            if (root.element.equals(o)) {
                size--;
                moveElements(root);
                return true;
            } else {
                size--;
                return find((T)o, root);
            }
        } else {
            return false;
        }
    }

    private boolean find(T e, Node<T> node) {
        if (comparator.compare(e, node.element) <= 0) {
            if (node.left.element.equals(e)) {
                return moveElements(node.left);
            } else {
                return find(e, node.left);
            }
        } else {
            if (node.right.element.equals(e)) {
                return moveElements(node.right);
            } else {
                return find(e, node.right);
            }
        }
    }

    private boolean moveElements(Node<T> topNode) {
        if (topNode.right == null && topNode.left == null) {
            topNode.element = null;
            return true;
        } else if (topNode.left == null) {
            topNode.element = findSuccessor(topNode.right).element;
            moveElements(topNode.right);
            return true;
        } else if (topNode.right == null) {
            topNode.element = findPredecessor(topNode.left).element;
            moveElements(topNode.left);
            return true;
        } else {
            topNode.element = findPredecessor(topNode.left).element;
            moveElements(topNode.left);
            return true;
        }
    }

    private Node<T> findPredecessor(Node<T> node) {
        if (node.right == null) {
            return node;
        } else {
            return findPredecessor(node.right);
        }
    }

    private Node<T> findSuccessor(Node<T> node) {
        if (node.left == null) {
            return node;
        } else {
            return findSuccessor(node.left);
        }
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (c == null || c.contains(null)) {
            throw new NullPointerException();
        }
//        Object[] table = c.toArray();
//        add((T) table[0]);
        return false;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        clear();
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}