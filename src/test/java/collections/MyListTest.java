package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyListTest {

    @Test
    void shouldReturnSizeMyList() {
        // Given
        MyList<Integer> myList = new MyList<>();
        // When
        myList.add(2);
        myList.add(3);
        myList.add(42);
        myList.add(5);
        myList.add(null);
        myList.add(5);
        myList.add(5);
        myList.add(5);
        // Then
        Assertions.assertEquals(8, myList.size());
    }

    @Test
    void shouldAddValueToMyList() {
        // Given
        MyList<Integer> myList = new MyList<>();
        // When
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(77);
        myList.add(8);
        // Then
        Assertions.assertEquals(5, myList.size());
    }

    @Test
    void shouldReturnTrueWhenMyListIsEmpty() {
        // Given
        MyList<Integer> myList = new MyList<>();
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
        // Then
        Assertions.assertEquals(myList.size, (sizeBeforeRemove - 1));
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

