package collections.tree;

public class Node<T> {

        public T element;
        public Node<T> left, right;

        public Node(T newElement) {
            element = newElement;
            left = null;
            right = null;
        }
}
