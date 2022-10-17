package collections.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

class BinaryTreeTest {
    BinaryTree<Integer> tree;
    private final Comparator<Integer> comparator = Integer::compareTo;

    @BeforeEach
    public void newTree() {
        tree = new BinaryTree<>(comparator);
        tree.add(3);
        tree.add(2);
        tree.add(0);
        tree.add(4);
        tree.add(6);
        tree.add(1);
        tree.add(5);
        tree.add(8);
    }

    @Test
    void shouldReturnTrueAfterAddingElement() {
        // Then
        Assertions.assertTrue(tree.add(7));
    }

    @Test
    void shouldIncreaseSizeOfTreeAfterAddingElement() {
        // When
        tree.add(7);
        // Then
        Assertions.assertEquals(9, tree.size());
    }

    @Test
    void shouldReturnSizeOfBinaryTree() {
        // When
        int size = tree.size();
        //Then
        Assertions.assertEquals(8, size);
    }

    @Test
    void shouldClearATree() {
        // When
        tree.clear();
        int size = tree.size();
        // Then
        Assertions.assertEquals(0, size);
    }

    @Test
    void shouldReturnFalseWhenTreeIsNotEmpty() {
        // Then
        Assertions.assertFalse(tree.isEmpty());
    }

    @Test
    void shouldReturnTrueWhenTreeIsEmpty() {
        // When
        tree.clear();
        // Then
        Assertions.assertTrue(tree.isEmpty());
    }


    @Test
    void shouldReturnTrueWhenTreeContainsObject() {
        // Then
        Assertions.assertTrue(tree.contains(6));
    }

    @Test
    void shouldReturnFalseWhenObjectIsNull() {
        // Then
        Assertions.assertFalse(tree.contains(null));
    }

    @Test
    void shouldReturnFalseWhenTreeNotContainsObject() {
        // Then
        BinaryTree<Integer> newTree = new BinaryTree<>(comparator);
        newTree.add(1);
        Assertions.assertTrue(newTree.contains(1));
    }

    @Test
    void shouldReturnTrueAfterRemoving() {
        // When
        //Then
        Assertions.assertTrue(tree.remove(1));
    }

    @Test
    void shouldRemoveObject() {
        // When
        tree.remove(2);
        int size = tree.size();
        //Then
        Assertions.assertEquals(7, size);
    }

    @Test
    void shouldNotContainsElementAfterRemoving() {
        // When
        tree.remove(4);
        //Then
        Assertions.assertFalse(tree.contains(4));
    }

    @Test
    void shouldReturnFalseWhenElementIsNotExistInTree() {
        // When
        //Then
        Assertions.assertFalse(tree.remove(20));
    }

    @Test
    void shouldReturnTrueWhenRemovingObjectIsRoot() {
        // Then
        BinaryTree<Integer> newTree = new BinaryTree<>(comparator);
        newTree.add(1);
        Assertions.assertTrue(newTree.remove(1));
    }

    @Test
    void shouldReturnTrueAfterRemovingObjectFromRightSide() {
        // When
        //Then
        Assertions.assertTrue(tree.remove(5));
    }

    @Test
    void shouldReturnTrueAfterRemovingObjectFromLeftSide() {
        // When
        //Then
        Assertions.assertTrue(tree.remove(4));
    }

    @Test
    void shouldReturnAfterRemovingTheEntireCollection() {
        //When
        //Then
        Assertions.assertTrue(tree.removeAll(tree));
    }
}