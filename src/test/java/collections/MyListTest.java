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
        List<Integer> myList = new MyList<>();
        // When
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(77);
        myList.add(8);
        // Then
        Assertions.assertEquals(77, myList.get(3));
    }

    @Test
    void shouldReturnFalseWhenMyListIsNotEmpty() {
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
        List<String> myList = new MyList<>();
        // When
        myList.add("dog");
        myList.add("cat");
        myList.add("chicken");
        myList.add("cow");
        myList.add("sheep");
        // Then
        Assertions.assertTrue(myList.remove("cat"));
    }

    @Test
    void shouldReturnFalseWhenThereIsNoSuchObjectInTheList() {
        // Given
        List<String> myList = new MyList<>();
        // When
        myList.add("dog");
        myList.add("cat");
        myList.add("chicken");
        myList.add("cow");
        myList.add("sheep");
        // Then
        Assertions.assertFalse(myList.remove("horse"));
    }

    @Test
    void shouldClearWholeList() {
        // Given
        List<String> myList = new MyList<>();
        // When
        myList.add("dog");
        myList.add("cat");
        myList.add("chicken");
        myList.add("cow");
        myList.add("sheep");
        myList.clear();
        // Then
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> myList.get(1));
    }

    @Test
    void shouldRemoveObjectWithGivenIndex() {
        // Given
        List<String> myList = new MyList<>();
        // When
        myList.add("dog");
        myList.add("cat");
        myList.add("chicken");
        myList.add("cow");
        myList.add("sheep");
        myList.remove(2);
        // Then
        Assertions.assertFalse(myList.contains("chicken"));
    }

    @Test
    void shouldReturnSmallerSizeOfListAfterRemoving() {
        // Given
        List<String> myList = new MyList<>();
        // When
        myList.add("dog");
        myList.add("cat");
        myList.add("chicken");
        myList.add("cow");
        myList.add("sheep");
        myList.remove(2);
        // Then
        Assertions.assertEquals(4, myList.size());
    }


    @Test
    void shouldReturnTrueIfListContainsObject() {
        // Given
        List<String> myList = new MyList<>();
        // When
        myList.add("dog");
        myList.add("cat");
        myList.add("chicken");
        myList.add("cow");
        myList.add("sheep");
        // Then
        Assertions.assertTrue(myList.contains("cow"));
    }

    @Test
    void shouldReturnFalseIfListNotContainsObject() {
        // Given
        List<String> myList = new MyList<>();
        // When
        myList.add("dog");
        myList.add("cat");
        myList.add("chicken");
        myList.add("cow");
        myList.add("sheep");
        // Then
        Assertions.assertFalse(myList.contains("horse"));
    }

    @Test
    void shouldReturnTheRemovedElement() {
        // Given
        List<String> myList = new MyList<>();
        // When
        myList.add("dog");
        myList.add("cat");
        myList.add("chicken");
        myList.add("cow");
        myList.add("sheep");
        // Then
        Assertions.assertEquals("chicken", myList.remove(2));
    }
}