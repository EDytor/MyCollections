package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MyListTest {

    @Test
    void shouldReturnSizeMyList() {
        // Given
        List<Integer> myList = new MyList<>();
        // When
        myList.add(2);
        myList.add(3);
        myList.add(42);
        myList.add(5);
        // Then
        Assertions.assertEquals(4, myList.size());
    }

    @Test
    void shouldAddValueToMyList() {
        // Given
        List<Integer> myList = new MyList<>(0);
        // When
        myList.add(8);
        myList.add(9);
        // Then
        Assertions.assertEquals(2, myList.size());
    }

    @Test
    void shouldReturnTrueWhenMyListIsEmpty() {
        // Given
        List<Integer> myList = new MyList<>();
        // When
        myList.add(4);
        // Then
        Assertions.assertFalse(myList.isEmpty());
    }

    @Test
    void shouldRemoveObjectFromList() {
        // Given
        MyList<String> myList = new MyList<>();
        // When
        myList.add("dog");
        myList.add("cat");
        myList.add("chicken");
        myList.add("cow");
        myList.add("sheep");
        int sizeBeforeRemove = myList.size();
        myList.remove("cat");
        int sizeAfterRemove = myList.size();
        // Then
        Assertions.assertEquals(sizeAfterRemove, (sizeBeforeRemove - 1));
    }

    @Test
    void shouldClearWholeList() {
        // Given
        MyList<String> myList = new MyList<>();
        // When
        myList.add("dog");
        myList.add("cat");
        myList.add("chicken");
        myList.add("cow");
        myList.add("sheep");
        myList.clear();
        // Then
        Assertions.assertNull(myList.get(3));
    }

    @Test
    void shouldRemoveObjectWithGivenIndex() {
        // Given
        MyList<String> myList = new MyList<>();
        // When
        myList.add("dog");
        myList.add("cat");
        myList.add("chicken");
        myList.add("cow");
        myList.add("sheep");
        // Then
        Assertions.assertEquals(myList.remove(2), "chicken");
    }

    @Test
    void shouldReturnTrueIfListContainsObject() {
        // Given
        MyList<String> myList = new MyList<>();
        // When
        myList.add("dog");
        myList.add("cat");
        myList.add("chicken");
        myList.add("cow");
        myList.add("sheep");
        // Then
        Assertions.assertTrue(myList.contains("cow"));
    }
}

